package ru.hh.school.example.exceptions;

public class NoSuchUserIdException extends Exception{

    private final Long userId;

    public NoSuchUserIdException(final Long userId) {
        super(userId.toString());
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }


}
