package com.codeup.snackmachine.models;

import java.util.List;

public class Inventory {

    private List<Item> items;

    public Inventory() {
    }

    public Inventory(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
