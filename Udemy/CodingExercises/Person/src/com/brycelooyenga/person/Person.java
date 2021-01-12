package com.brycelooyenga.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return this.firstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }

    }

    public String getFullName() {
        if ((firstName.isEmpty()) && (lastName.isEmpty())) return "";
        if (lastName.isEmpty()) return firstName;
        if (firstName.isEmpty()) return lastName;
        else return firstName + " " + lastName;

    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name= " + person.getFullName());
        person.setAge(-2);
        System.out.println(person.getAge());
    }
}



