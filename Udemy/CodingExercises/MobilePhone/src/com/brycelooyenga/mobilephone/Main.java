package com.brycelooyenga.mobilephone;

public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("3062904743");

        Contact contact = new Contact("Bryce Looyenga", "3062904743");
        Contact contact2 = new Contact("Brad Humbert", "3069559188");
        Contact contact3 = new Contact("Jason Jensen", "3069554280");
        phone.addContact(contact);
        phone.addContact(contact2);
        phone.addContact(contact3);
        phone.printContacts();

        System.out.println(phone.UpdateContact(contact, contact3));
        System.out.println("========================");
        phone.printContacts();

    }
}
