package com.bank.atm.exception;

public class CannotDispenseCashException extends BankingException {
    public CannotDispenseCashException(String message) {
        super(message);
    }
}
