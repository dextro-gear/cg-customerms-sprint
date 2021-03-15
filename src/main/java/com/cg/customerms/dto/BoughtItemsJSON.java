package com.cg.customerms.dto;

import java.util.List;

public class BoughtItemsJSON {

    List<ItemDetails> items;

    public BoughtItemsJSON(List<ItemDetails> items) {
        this.items = items;
    }

    public List<ItemDetails> getItems() {
        return items;
    }

    public void setItems(List<ItemDetails> items) {
        this.items = items;
    }
}
