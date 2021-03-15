package com.cg.customerms.utilities;

import com.cg.customerms.dto.BoughtItemsJSON;
import com.cg.customerms.dto.CustomerJSON;
import com.cg.customerms.dto.ItemDetails;
import com.cg.customerms.entities.Customer;
import com.cg.items.entities.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class CustomerUtilities {

    public CustomerJSON toJSON(Customer customer){
        return new CustomerJSON(customer.getID(), customer.getName());
    }

    public BoughtItemsJSON toJSON(Set<Item> boughtItems){
        List<ItemDetails> returnList = new ArrayList<ItemDetails>();

        for(Item item: boughtItems){
            returnList.add(new ItemDetails(item));
        }

        return new BoughtItemsJSON(returnList);
    }

}
