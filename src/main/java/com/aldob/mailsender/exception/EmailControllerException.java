package com.aldob.mailsender.exception;

public class EmailControllerException extends RuntimeException{
    public EmailControllerException(String message, Throwable cause){
        super(message, cause);
    }
}
