package org.example.mobile;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone() {
    }

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact){
        if (doesExist(contact)){
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact contact1,Contact contact2){
        if (!doesExist(contact1)){
            return false;
        }else{
            int index = myContacts.indexOf(contact1);
            myContacts.set(index,contact2);
            return true;
        }
    }

    public boolean removeContact(Contact contact){
        System.out.println(doesExist(contact));
        if(doesExist(contact)){
            myContacts.remove(contact);
            return true;
        }else return false;
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContact(){
        for(Contact contact : myContacts){
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber() );
        }

    }



    private boolean doesExist(Contact contact){
        return myContacts.contains(contact);
    }
}
