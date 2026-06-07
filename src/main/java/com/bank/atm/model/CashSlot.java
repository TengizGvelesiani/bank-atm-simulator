package com.bank.atm.model;

public class CashSlot {
    private Currency currency;
    private int denomination;
    private int notesCount;

    public CashSlot(Currency currency, int denomination, int notesCount) {
        this.currency = currency;
        this.denomination = denomination;
        this.notesCount = notesCount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getDenomination() {
        return denomination;
    }

    public int getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }
}
