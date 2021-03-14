package com.cg.customerms.dto;

public class CustomerJSON {

    private long customerID;
    private String customerName;

    public CustomerJSON(){}

    public CustomerJSON(long customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
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
}
