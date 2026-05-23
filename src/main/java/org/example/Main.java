package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("64646464" ,new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Kenan", "343434332423"));
        mobilePhone.addNewContact(new Contact("Kenan", "343434332423"));
        mobilePhone.addNewContact(new Contact("Berat", "3434343433423"));
        mobilePhone.printContacts();

    }
}
