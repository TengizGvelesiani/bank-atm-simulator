package com.bank.atm.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Account extends BaseEntity {
    private final UUID ownerUserId;
    private final Currency currency;
    private BigDecimal balance;

    public Account(UUID ownerUserId, Currency currency, BigDecimal initialBalance) {
        this.ownerUserId = ownerUserId;
        this.currency = currency;
        this.balance = initialBalance;
    }

    public UUID getOwnerUserId() {
        return ownerUserId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
