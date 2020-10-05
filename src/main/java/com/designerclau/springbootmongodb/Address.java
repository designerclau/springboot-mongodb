package com.designerclau.springbootmongodb;

public class Address {
    private String city;
    private String Country;

    protected Address(){}


    public Address(String city, String country) {
        this.city = city;
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return Country;
    }


}
