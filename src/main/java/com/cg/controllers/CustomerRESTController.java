package com.cg.controllers;

import com.cg.customerms.dto.BoughtItemsJSON;
import com.cg.customerms.dto.CreateCustomerRequest;
import com.cg.customerms.dto.CustomerJSON;
import com.cg.customerms.dto.UpdateCustomerRequest;
import com.cg.customerms.services.CustomerServiceImpl;
import com.cg.customerms.utilities.CustomerUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
    * 5. Retrieve all customers. (Optional)
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
}
