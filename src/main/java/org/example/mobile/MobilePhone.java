package org.example.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class MobilePhone {

    private String myNumber;

    private List<Contact> myContacts;


    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }


    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {

        if (contact == null || contact.getPhoneNumber() == null || contact.getName() == null) {
            return false;
        }

        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        return this.myContacts.add(contact);
    }

    public int findContact(Contact contact) {


        return myContacts.indexOf(contact);

    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {

            Contact contact = myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {

                return i;  // İlgili indeksi döner
            }
        }

        return -1;  // Eğer bulunmazsa -1 döner
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = myContacts.indexOf(oldContact);

        if (foundPosition <= 0) {
            return false;
        }

        myContacts.set(foundPosition, newContact);
        return true;

    }

    public boolean removeContact(Contact contact) {

        if(contact==null || findContact(contact)<0) {
            return false;
        }

        return this.myContacts.remove(contact);

    }


    public Contact queryContact(String contactName) {

            int contactIndex = findContact(contactName);

            if(contactIndex < 0){
                return null;
            }

            return this.myContacts.get(contactIndex);


    }

    public void printContacts() {

        for (int i=0; i< myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + ". " + contact.getName() + "->" + contact.getPhoneNumber() );
        }

    }
}
