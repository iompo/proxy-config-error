package com.test.proxyconfigerror.exception;

public class NonexistentEntityException extends Exception {

    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentEntityException(String message) {
        super(message);
    }

    public NonexistentEntityException(Class entity, Long id) {
        this(String.format("%s [id: %d] not found", entity.getSimpleName(), id));
    }

    public NonexistentEntityException(Class entity, String id) {
        this(String.format("%s [id: %s] not found", entity.getSimpleName(), id));
    }
}
