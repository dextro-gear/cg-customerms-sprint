package com.cg.customerms.utilities;

import com.cg.customerms.dto.CustomerJSON;
import com.cg.customerms.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerUtilities {

    public CustomerJSON toJSON(Customer customer){
        return new CustomerJSON(customer.getID(), customer.getName());
    }

}
