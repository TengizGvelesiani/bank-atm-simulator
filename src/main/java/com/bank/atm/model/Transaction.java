package com.bank.atm.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class Transaction extends BaseEntity {
    private final UUID fromAccountId;
    private final UUID toAccountId;
    private final BigDecimal amount;
    private final Currency currency;
    private final TransactionType type;
    private final Instant timestamp;
    private TransactionStatus status;

    public Transaction(
            UUID fromAccountId,
            UUID toAccountId,
            BigDecimal amount,
            Currency currency,
            TransactionType type,
            TransactionStatus status
    ) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
        this.currency = currency;
        this.type = type;
        this.timestamp = Instant.now();
        this.status = status;
    }

    public UUID getFromAccountId() {
        return fromAccountId;
    }

    public UUID getToAccountId() {
        return toAccountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public TransactionType getType() {
        return type;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}
