package com.bank.atm.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class User extends BaseEntity {
    private final String fullName;
    private final List<UUID> accountIds = new ArrayList<>();

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public List<UUID> getAccountIds() {
        return Collections.unmodifiableList(accountIds);
    }

    public void addAccount(UUID accountId) {
        accountIds.add(accountId);
    }
}
