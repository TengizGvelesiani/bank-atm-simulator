package com.bank.atm.model;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseEntity {
    private final UUID id;
    private final Instant createdAt;

    protected BaseEntity() {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
