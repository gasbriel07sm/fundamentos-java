package curso_nelio_alves_poo.enumeracao_composicao.Exercicio02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", dtf);
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        Integer likes = 12;

        Post p1 = new Post(moment, title, content, likes);

        p1.addComment(new Comment("Wow that's awesome!"));
        p1.addComment(new Comment("Have a nice trip"));

        moment = LocalDateTime.parse("28/07/2018 23:14:19", dtf);
        title = "Good night guys";
        content = "See you tomorrow";
        likes = 5;

        Post p2 = new Post(moment, title, content, likes);

        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("Maybe the Force be with you"));

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);

        sc.close();
    }
}
