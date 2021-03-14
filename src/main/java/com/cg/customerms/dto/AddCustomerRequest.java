package com.cg.customerms.dto;

public class AddCustomerRequest {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddCustomerRequest(String name) {
        this.name = name;
    }

}
