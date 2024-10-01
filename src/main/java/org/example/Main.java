package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

public class Main {
    public static void main(String[] args) {

        Grocery.groceryList.add("tomato");
        Grocery.addItems("tomato");
        Grocery.addItems("cherry,artichoke");
        Grocery.addItems("cherry,potato");

        System.out.println(Grocery.groceryList);
        System.out.println(Grocery.groceryList.size());


    }
}
