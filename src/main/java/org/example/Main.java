package org.example;

import org.example.models.Grocery;
import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {

        // --- Grocery Test ---
        System.out.println("=== Grocery List Uygulaması ===");
        Grocery.startGrocery();

        // --- Mobile Phone Test ---
        System.out.println("\n=== Mobile Phone Uygulaması ===");
        MobilePhone phone = new MobilePhone("5551234567");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.printContact();

        Contact updatedBob = Contact.createContact("Bobby", "99999999");
        phone.updateContact(bob, updatedBob);
        phone.printContact();

        phone.removeContact(alice);
        phone.printContact();
    }
}
