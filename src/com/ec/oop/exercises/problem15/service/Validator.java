package com.ec.oop.exercises.problem15.service;

import com.ec.oop.exercises.problem15.exception.FullNameException;

public class Validator {

    public static void nameCheck(String name) throws FullNameException {
        String[] str = name.split(" ");
        if (str.length < 2) {
            throw new FullNameException("Please enter Full Name");
        }
    }

}
