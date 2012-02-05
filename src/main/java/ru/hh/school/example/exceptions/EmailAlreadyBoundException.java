package ru.hh.school.example.exceptions;

public class EmailAlreadyBoundException extends Exception {

    private final String email;

    public EmailAlreadyBoundException(String email) {
        super(email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
