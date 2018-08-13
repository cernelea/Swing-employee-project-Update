package com.tekwill.Model;

public class ContactInfo {

    private String name;

    private String phoneNumber;
    private Address adress;

    public ContactInfo(String name, String phoneNumber, Address adress) {
        this.name = name;

        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " " + adress + "\nThe phone number is: " + phoneNumber;
    }

}
