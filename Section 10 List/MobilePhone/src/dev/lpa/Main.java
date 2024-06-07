package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
}

class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) == -1) {
            return myContacts.add(contact);
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);

        if(oldContactIndex > -1) {
            myContacts.set(oldContactIndex, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contact) {
        for (Contact e: myContacts) {
            if(e.getName() == contact) {
                return findContact(e);
            }
        }
        return -1;
    }

    public Contact queryContact(String contact) {
        int contactIndex = findContact(contact);

        if (contactIndex > -1) {
            return myContacts.get(contactIndex);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact e: myContacts) {
            System.out.printf("%d. %s -> %s%n", findContact(e) + 1, e.getName(), e.getPhoneNumber());
        }
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
