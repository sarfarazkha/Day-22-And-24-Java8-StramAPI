package com.bridgelabz.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook{
    private  String addressBookName;
    static Scanner scanner = new Scanner(System.in);

    List<Contacts> contactsList = new ArrayList<>();

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public AddressBook() {
    }

    void addAddressBook() {
        System.out.println("Enter the name of AddressBook");
        addressBookName = scanner.next();
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBookName='" + addressBookName + '\'' +
                '}';
    }
}






