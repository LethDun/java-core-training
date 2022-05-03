package com.ec.oop.exercises.problem15.exception;

import java.time.format.DateTimeParseException;

public class BirthDayException extends DateTimeParseException {

    public BirthDayException(String message, CharSequence parsedData, int errorIndex) {
        super(message, parsedData, errorIndex);
    }
}
