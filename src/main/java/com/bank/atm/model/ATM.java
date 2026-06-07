package com.bank.atm.model;

public class ATM extends BaseEntity {
    private final String locationCode;
    private final AtmCashInventory cashInventory;

    public ATM(String locationCode, AtmCashInventory cashInventory) {
        this.locationCode = locationCode;
        this.cashInventory = cashInventory;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public AtmCashInventory getCashInventory() {
        return cashInventory;
    }
}
