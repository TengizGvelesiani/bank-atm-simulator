package com.bank.atm.controller;

import com.bank.atm.service.AccountService;
import com.bank.atm.service.AtmService;
import com.bank.atm.service.TransactionService;
import com.bank.atm.view.ConsoleView;

public class AtmController {
    private final AccountService accountService;
    private final TransactionService transactionService;
    private final AtmService atmService;
    private final ConsoleView view;

    public AtmController(
            AccountService accountService,
            TransactionService transactionService,
            AtmService atmService,
            ConsoleView view
    ) {
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.atmService = atmService;
        this.view = view;
    }

    public void start() {
        view.showMessage("ATM simulator skeleton is ready.");
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    public AtmService getAtmService() {
        return atmService;
    }
}
