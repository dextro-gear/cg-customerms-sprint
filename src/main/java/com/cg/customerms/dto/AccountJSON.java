package com.cg.customerms.dto;

import com.cg.customerms.entities.Account;

public class AccountJSON {
    long id;
    double balance;

    public AccountJSON(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
