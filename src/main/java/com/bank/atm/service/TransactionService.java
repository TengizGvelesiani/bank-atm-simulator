package com.bank.atm.service;

import com.bank.atm.model.Currency;
import com.bank.atm.model.Transaction;

import java.math.BigDecimal;
import java.util.UUID;

public interface TransactionService {
    Transaction transfer(UUID fromAccountId, UUID toAccountId, BigDecimal amount, Currency currency);

    Transaction externalDeposit(UUID toAccountId, BigDecimal amount, Currency currency);

    Transaction externalWithdraw(UUID fromAccountId, BigDecimal amount, Currency currency);
}
