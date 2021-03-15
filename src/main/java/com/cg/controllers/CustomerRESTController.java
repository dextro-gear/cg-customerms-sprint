package com.cg.controllers;

import com.cg.customerms.dto.*;
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
    * 1. Add customer. ---> DONE
    * 2. Update Customer ---> DONE
    * 3. Find Customer ---> DONE
    * 4. Retrieve items bought by customer. ---> DONE
    * 5. Add amount to customer balance ---> DONE
    */

    // Add customer
    @PostMapping("/add")
    public CustomerJSON addCustomer(@RequestBody CreateCustomerRequest request) {
        return customerUtil.toJSON(customerService.createCustomer(request.getName()));
    }

    @PutMapping("/update")
    public CustomerJSON updateCustomer(@RequestBody UpdateCustomerRequest request){
        return customerUtil.toJSON(customerService.updateCustomer(request.getId(), request.getName()));
    }

    @GetMapping("/get/byID/{id}")
    public CustomerJSON findCustomer(@PathVariable("id") long customerID){
        return customerUtil.toJSON(customerService.findByID(customerID));
    }

    @GetMapping("/getItemsBoughtByCustomer/{id}")
    public BoughtItemsJSON retrieveItemsBoughtByCustomer(@PathVariable("id") long customerID){
        return customerUtil.toJSON(customerService.itemsBoughtByCustomer(customerID));
    }

    @PutMapping("/addToBalance")
    public CustomerJSON addBalanceToCustomerAccount(@RequestBody UpdateCustomerBalanceRequest request){
        return customerUtil.toJSON(customerService.addAmount(request.getId(), request.getAmount()));
    }
}
