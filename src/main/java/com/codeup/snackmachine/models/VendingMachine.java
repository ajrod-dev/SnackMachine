package com.codeup.snackmachine.models;

import java.util.*;

public class VendingMachine {

    private double account;

    private double refund;
    private Inventory inventory;

    public VendingMachine(double bank, Inventory inventory) {
        this.account = account;
        this.inventory = inventory;
    }

    public VendingMachine(){

    }

    public double issueRefund(double amount){

        return refund;
    }

    public String dispenseItem(Item item){

        return "item dispensed";
    };

    public void cancelPurchase(){
        System.out.println("Purchase canceled");
    }



}
