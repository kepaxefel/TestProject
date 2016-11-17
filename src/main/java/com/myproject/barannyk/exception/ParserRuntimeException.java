package com.myproject.barannyk.exception;

/**
 * Created by Roman_Barannyk on 11/17/2016.
 */
public class ParserRuntimeException extends RuntimeException {

    public ParserRuntimeException(String message, Exception e) {
        super(message, e);
    }
}
