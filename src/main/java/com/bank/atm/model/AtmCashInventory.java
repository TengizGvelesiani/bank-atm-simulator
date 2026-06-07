package com.bank.atm.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AtmCashInventory {
    private final List<CashSlot> slots = new ArrayList<>();

    public List<CashSlot> getSlots() {
        return Collections.unmodifiableList(slots);
    }

    public void addSlot(CashSlot slot) {
        slots.add(slot);
    }
}
