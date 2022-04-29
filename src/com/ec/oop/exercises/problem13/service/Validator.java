package com.ec.oop.exercises.problem13.service;

import com.ec.oop.exercises.problem13.exception.BirthDayException;
import com.ec.oop.exercises.problem13.exception.EmailException;
import com.ec.oop.exercises.problem13.exception.FullNameException;
import com.ec.oop.exercises.problem13.exception.PhoneException;
import java.time.LocalDate;

public class Validator {

    public static void nameCheck(String name) throws FullNameException{
        String[] str = name.split(" ");
        if (str.length < 2) {
            throw new FullNameException("Please enter Full Name");
        }
    }

    public static void birthDayCheck(LocalDate birthDay) throws BirthDayException {

    }

    public static void phoneCheck(String phone) throws PhoneException {
        if (phone.length() != 10 && phone.length() != 12) {
            throw new PhoneException("Wrong phone number");
        }
    }

    public static void emailCheck(String email) throws EmailException {
        if (!email.contains("gmail.com")) {
            throw new EmailException("Please emter gmail");
        }
    }

}
