package com.ec.exception;

import java.io.IOException;

public class CustomException extends IOException {

    @Override
    public String getMessage() {
        return "throw custom exception";
    }

}
