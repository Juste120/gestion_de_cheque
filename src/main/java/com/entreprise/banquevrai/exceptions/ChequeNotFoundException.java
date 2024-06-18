package com.entreprise.banquevrai.exceptions;


public class ChequeNotFoundException extends RuntimeException {
    public ChequeNotFoundException(String message) {
        super(message);
    }
}
