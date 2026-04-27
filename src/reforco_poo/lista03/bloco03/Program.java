package reforco_poo.lista03.bloco03;

import reforco_poo.lista03.bloco03.entities.User;
import reforco_poo.lista03.bloco03.exceptions.DuplicateUsernameException;
import reforco_poo.lista03.bloco03.exceptions.InvalidEmailException;
import reforco_poo.lista03.bloco03.exceptions.WeakPasswordException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        List<User> users = new ArrayList<>();

        System.out.print("Users: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print("\nUsername: ");
            String username = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            try {
                for (User u : users) {
                    if (u.getUsername().equals(username)) {
                        throw new DuplicateUsernameException("Username " + username + " already exists.");
                    }
                }
                User user = new User(username, email, password);
                user.validate();
                users.add(user);

            } catch (InvalidEmailException | WeakPasswordException | DuplicateUsernameException e) {
                System.out.println(e.getClass().getSimpleName() + ": \n" + e.getMessage());
            }
        }

        System.out.println("\nREGISTERED USERS: ");
        for (User u : users) {
            System.out.println(u.getUsername() + " - " + u.getEmail());
            System.out.println("(registered: " + u.getCreatedAt().format(dtf) + ")");
        }

        sc.close();
    }
}
