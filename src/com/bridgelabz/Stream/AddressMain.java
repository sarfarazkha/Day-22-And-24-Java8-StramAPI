package com.bridgelabz.Stream;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class AddressMain {
    static Map<String, AddressBook> addressBookMap = new HashMap<>();

    static Map<String, List<Contacts>> cityContactsMap = new HashMap<>();


    static Map<String, List<Contacts>> stateContactsMap = new HashMap<>();


    void getCount(String state) {
        int count = 0;
        for (Map.Entry<String, AddressBook> addressBookEntry : addressBookMap.entrySet()) {
            for (int i = 0; i < (addressBookEntry.getValue()).contactsList.size(); i++) {
                Contacts contacts = addressBookEntry.getValue().contactsList.get(i);
                if (state.equals(contacts.getState())) {
                    count++;
                }
            }
        }
        System.out.println("Total Person Count in state " + state + ": " + count);
    }


    public static void main(String[] args) {
        Contacts c1 = new Contacts("saffu", "khan", "saffu@123",
                "9900", "Hosa oni",
                580001, "Maharastra", "Mumbai");
        Contacts c2 = new Contacts("sattu", "khan", "sattu@123",
                "8800", "Hosa oni",
                580001, "Karnataka", "Dharwad");
        Contacts c3 = new Contacts("Chinnu", "Khan", "Chinnu@123",
                "7700", "Hosa oni",
                580001, "Delhi", "Delhi");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.contactsList.add(c1);
        addressBook1.contactsList.add(c2);
        addressBook1.contactsList.add(c3);


        Contacts c4 = new Contacts("Parwez", "khan", "paarth@123",
                "9900", "Hosa oni",
                580001, "Maharastra", "Pune");
        Contacts c5 = new Contacts("taiyaba", "khan", "tayu@123",
                "9900", "Hosa oni",
                580001, "Karnataka", "Dharwad");
        Contacts c6 = new Contacts("satyam", "asati", "satyam@123",
                "9900", "Hosa oni",
                580001, "Delhi", "agra");

        AddressBook addressBook2 = new AddressBook();
        addressBook2.contactsList.add(c4);
        addressBook2.contactsList.add(c5);
        addressBook2.contactsList.add(c6);

        addressBookMap.put("AddressBook1", addressBook1);
        addressBookMap.put("AddressBook2", addressBook2);


        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook addressBook = entry.getValue();
            List<Contacts> contactsList = addressBook.contactsList.stream().
                    filter(x -> x.getCity().equals("Mumbai")).collect(Collectors.toList());
            System.out.println(contactsList);
        }

        AddressMain addressMain = new AddressMain();
        addressMain.getCount("Maharastra");

    }
}