package com.cg.customerms.dto;

import com.cg.items.entities.Item;

public class ItemDetails {
    String id;
    String description;

    public ItemDetails(String id, String desc) {
        this.id = id;
        this.description = desc;
    }

    public ItemDetails(Item item){
        this.id = item.getId();
        this.description = item.getDescription();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
}
