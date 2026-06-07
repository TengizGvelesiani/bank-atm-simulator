package com.bank.atm.service;

import com.bank.atm.model.Currency;
import com.bank.atm.model.WithdrawalOption;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface AtmService {
    List<WithdrawalOption> getWithdrawalOptions(Currency currency, BigDecimal amount);

    void withdraw(UUID accountId, Currency currency, BigDecimal amount, WithdrawalOption selectedOption);
}
