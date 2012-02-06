package ru.hh.school.example.exceptions;

public class NoSuchEmailException extends Exception{

    private final String email;

    public NoSuchEmailException(final String email) {
        super(email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
