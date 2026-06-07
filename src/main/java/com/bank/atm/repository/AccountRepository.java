package com.bank.atm.repository;

import com.bank.atm.model.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {
    Account save(Account account);

    Optional<Account> findById(UUID accountId);

    List<Account> findByUserId(UUID userId);
}
