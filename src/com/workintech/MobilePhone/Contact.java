package com.workintech.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String myNumber;
    private String name;



    public Contact(String myNumber, String name) {
        this.myNumber = myNumber;
        this.name = name;

    }

    public String getPhoneNumber() {
        return myNumber;
    }

    public String getName() {
        return name;
    }




}
