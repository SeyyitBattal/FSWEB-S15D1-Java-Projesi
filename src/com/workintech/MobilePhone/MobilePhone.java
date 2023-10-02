package com.workintech.MobilePhone;


import java.util.ArrayList;
import java.util.List;

public class MobilePhone {



    public static void main(String[] args) {

        Contact contact1 = new Contact("1234121231", "Ali");
        Contact contact2 = new Contact("9787576576", "Veli");
        Contact contact3 = new Contact("2323564554", "Osman");

        List<Contact> myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldCont, Contact newCont) {
        if (myContacts.contains(oldCont) &&
                newCont.getPhoneNumber().matches("\\d+") &&
                newCont != oldCont) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact1 = myContacts.get(i);
            if (contact1.getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact isim : myContacts) {
            if (isim.equals(contactName)) {
                return isim;
            }
        }
        return null;
    }

    public void printContact() {
        for (Contact myNameList : myContacts) {
            System.out.println(myNameList.getName() + " -> " + myNameList.getPhoneNumber());
        }
    }

}
