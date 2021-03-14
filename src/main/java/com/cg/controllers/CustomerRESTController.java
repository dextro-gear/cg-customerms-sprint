package com.cg.controllers;

import com.cg.customerms.dto.AddCustomerRequest;
import com.cg.customerms.dto.CustomerJSON;
import com.cg.customerms.services.CustomerServiceImpl;
import com.cg.customerms.utilities.CustomerUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customer")
@RestController
public class CustomerRESTController {

    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    CustomerUtilities customerUtil;

    /*
    * 1. Add customer.
    * 2. Update Customer
    * 3. Find Customer
    * 4. Retrieve items bought by customer.
    * 5. Retrieve all customers. (Optional)
    */

    // Add customer
    @PostMapping("/add")
    public CustomerJSON addCustomer(@RequestBody AddCustomerRequest request) {
        return customerUtil.toJSON(customerService.createCustomer(request.getName()));
    }

    @PostMapping("/update")

}
