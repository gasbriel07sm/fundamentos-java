package reforco_poo.lista03.bloco03.entities;

import reforco_poo.lista03.bloco03.exceptions.DuplicateUsernameException;
import reforco_poo.lista03.bloco03.exceptions.InvalidEmailException;
import reforco_poo.lista03.bloco03.exceptions.WeakPasswordException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class User implements Validatable {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public void validate() {
        boolean emailValido = email.matches(".*@.*\\..*");
        boolean senhaValida = password.length() >= 8;
        if (!emailValido) {
            throw new InvalidEmailException(getEmail() + " is not a valid email.");
        }

        if (!senhaValida) {
            throw new WeakPasswordException("Password too short (min 8 chars).");
        }

        System.out.println(getUsername() + " registered successfully.");
    }
}
