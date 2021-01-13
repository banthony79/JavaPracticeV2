package com.brycelooyenga.mobilephone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList <Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


    public boolean addContact(Contact newContact) {
        if (findContact(newContact) == -1) {
            myContacts.add(newContact);
            return true;
        }


   return false;  }


    private int findContact(Contact checkedContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (checkedContact == myContacts.get(i)) {
                return i;
            }

        }
        return -1;}


    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }

        }
        return -1; }


        public boolean UpdateContact (Contact oldContact, Contact newContact){
            if (findContact(oldContact) != -1) {
                int contactIndex = findContact(oldContact);
                myContacts.set(contactIndex, newContact);
                return true;

            }

       return false;  }



        public boolean removeContact(Contact removedContact) {
            if (findContact(removedContact) != -1) {
                int contactIndex = findContact(removedContact);
                myContacts.remove(contactIndex);
                return true;
            }

      return false;   }



        public Contact queryContact(String contactName) {
            for (Contact contact: myContacts) {
                if (contact.getName().equals(contactName)) {
                    return contact;
                }
            }

      return null;   }


        public void printContacts() {
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i + 1) + ": " + myContacts.get(i).getName() + " -> " +
                        myContacts.get(i).getPhoneNumber());
            }
        }

}
