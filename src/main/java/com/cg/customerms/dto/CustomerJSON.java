package com.cg.customerms.dto;

import com.cg.customerms.entities.Account;

public class CustomerJSON {

    private long customerID;
    private String customerName;
    private AccountJSON account;

    public CustomerJSON(){}

    public CustomerJSON(long customerID, String customerName, Account account) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.account = new AccountJSON(account.getAccountID(), account.getBalance());
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public AccountJSON getAccount() {
        return account;
    }

    public void setAccount(AccountJSON account) {
        this.account = account;
    }
}
