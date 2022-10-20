package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    @NotNull(message="User Name is Required.")
    @NotBlank(message="User Name is Required.")
    @Size(min=5, max=15, message = "User name needs to be in between 5 and 15 characters")
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotNull(message="Password is Required.")
    @NotBlank(message="Password is Required.")
    @Size(min=6)
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
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
}
