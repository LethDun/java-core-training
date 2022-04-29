package com.ec.oop.exercises.problem13.exception;

import java.util.function.Supplier;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String message) {
        super(message);
    }
}
