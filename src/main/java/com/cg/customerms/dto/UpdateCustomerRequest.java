package com.cg.customerms.dto;

public class UpdateCustomerRequest {
    long customerID;
    String name;

    public UpdateCustomerRequest(long customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
