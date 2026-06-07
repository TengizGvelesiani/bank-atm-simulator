package com.bank.atm.service;

import com.bank.atm.model.Account;
import com.bank.atm.model.Currency;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public interface AccountService {
    Account createAccount(UUID userId, Currency currency, BigDecimal initialBalance);

    Optional<Account> findById(UUID accountId);

    BigDecimal getBalance(UUID accountId);
}
