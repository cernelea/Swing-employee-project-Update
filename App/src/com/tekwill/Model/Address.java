/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.Model;

public class Address {

    private String country;

    private String postCode;

    private String street;

    public Address(String country, String postCode, String street) {
        this.country = country;
        this.postCode = postCode;
        this.street = street;
    }

    public String getContry() {
        return country;
    }

    public void setContry(String contry) {
        this.country = contry;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "\nCountry: " + this.country + "\nPostcode: " + this.postCode + "\nStreet: " + this.street;
    }

}
