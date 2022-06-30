package com.bridgelabz.Stream;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddressMain {
    static Map<String, AddressBook> addressBookMap = new HashMap<>();

    static Map<String, List<Contacts>> cityContactsMap = new HashMap<>();


    static Map<String, List<Contacts>> stateContactsMap = new HashMap<>();

    public static void main(String[] args) {
        Contacts c1 = new Contacts("saffu", "khan", "saffu@123",
                "9900", "nagpur",
                580001, "Maharastra", "Mumbai");
        Contacts c2 = new Contacts("sattu", "khan", "sattu@123",
                "8800", "Hosa oni",
                580001, "Karnataka", "Dharwad");
        Contacts c3 = new Contacts("Chinnu", "Khan", "Chinnu@123",
                "7700", "Hosa oni",
                580001, "Delhi", "Delhi");
        Contacts c4 = new Contacts("Parwez", "khan", "paarth@123",
                "9900", "Hosa oni",
                580001, "Maharastra", "Pune");
        Contacts c5 = new Contacts("taiyaba", "khan", "tayu@123",
                "9900", "Hosa oni",
                580001, "Karnataka", "Dharwad");
        Contacts c6 = new Contacts("satyam", "asati", "pavan@123",
                "9900", "Hosa oni",
                580001, "Delhi", "agra");

        AddressBook addressBook1 = new AddressBook();
        addressBook1.contactsList.add(c1);
        addressBook1.contactsList.add(c2);
        addressBook1.contactsList.add(c3);
        addressBook1.contactsList.add(c3);
        addressBook1.contactsList.add(c4);
        addressBook1.contactsList.add(c5);

        addressBookMap.put("Addressbook1", addressBook1);

        addressBook1.contactsList.stream().forEach(x -> {
            if (stateContactsMap.containsKey(x.getState())) {
                List<Contacts> contactsList = stateContactsMap.get(x.getState());
                contactsList.add(x);
            } else {
                List<Contacts> contactsList = new ArrayList<>();
                contactsList.add(x);
                stateContactsMap.put(x.getState(), contactsList);
            }
        });
        addressBook1.contactsList.stream().forEach(x -> {
            if (cityContactsMap.containsKey(x.getCity())) {
                List<Contacts> contactsList = cityContactsMap.get(x.getCity());
                contactsList.add(x);
            } else {
                List<Contacts> contactsList = new ArrayList<>();
                contactsList.add(x);
                cityContactsMap.put(x.getCity(), contactsList);
            }
        });

        System.out.println(addressBook1.contactsList);
        System.out.println("state Contact map");
        System.out.println(stateContactsMap);
        System.out.println("City Contact Map");
        System.out.println(cityContactsMap);
    }
}