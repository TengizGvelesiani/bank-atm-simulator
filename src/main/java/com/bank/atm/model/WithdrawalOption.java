package com.bank.atm.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WithdrawalOption {
    private final Currency currency;
    private final Map<Integer, Integer> notesByDenomination;

    public WithdrawalOption(Currency currency, Map<Integer, Integer> notesByDenomination) {
        this.currency = currency;
        this.notesByDenomination = new HashMap<>(notesByDenomination);
    }

    public Currency getCurrency() {
        return currency;
    }

    public Map<Integer, Integer> getNotesByDenomination() {
        return Collections.unmodifiableMap(notesByDenomination);
    }
}
