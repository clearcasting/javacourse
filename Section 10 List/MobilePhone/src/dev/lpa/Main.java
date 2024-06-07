package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
}

class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    private boolean addNewContact(Contact contact) {
        for (Contact element: myContacts){
            if (myContacts.indexOf(contact) < 0) {

            }
        }
        return false;
    }

}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
