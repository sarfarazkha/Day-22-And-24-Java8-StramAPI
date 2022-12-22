package com.bridgelabz.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String address;
    private int zip;
    private String state;
    private String city;

    static Scanner scanner = new Scanner(System.in);

    public Contacts() {
    }

    public Contacts(String firstname, String lastname, String email,
                    String phoneNumber, String address, int zip, String state, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zip = zip;
        this.state = state;
        this.city = city;
    }

    void addContact() {
        System.out.println("Add the contact");
        int numberOfContacts = scanner.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter the firstName");
            firstname = scanner.next();
            System.out.println("Enter the Lastname");
            lastname = scanner.next();
            System.out.println("Enter the Email");
            email = scanner.next();
            System.out.println("Enter the phonenumber");
            phoneNumber = scanner.next();
            System.out.println("Enter the Address");
            address = scanner.next();
            System.out.println("Enter the Zip");
            zip = scanner.nextInt();
            System.out.println("Enter the state");
            state = scanner.next();
            System.out.println("Enter the city");
            city = scanner.next();
            System.out.println("Contact number " + (i + 1) + " saved");
            System.out.println("==================================");
            Contacts contacts1 = new Contacts(firstname, lastname, email,
                    phoneNumber, address, zip, state, city);
            AddressMain.contactsMap.put(contacts1.getPhoneNumber(), contacts1);
        }
    }

    void displayContact() {
        System.out.println("FirstName:" + firstname + "\n" + "Lastname:"
                + lastname + "\n" + "Phonenumber:" + "\n" + phoneNumber + "Address:" + address + "\n"
                + "zip:" + zip + "\n" + "state:" + state + "\n" + "city" + city);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
