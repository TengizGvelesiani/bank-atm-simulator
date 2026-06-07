package com.bank.atm.repository;

import com.bank.atm.model.AtmCashInventory;

public interface AtmInventoryRepository {
    AtmCashInventory getInventory();

    void save(AtmCashInventory inventory);
}
