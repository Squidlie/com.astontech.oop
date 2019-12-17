package com.astontech.bo;

import java.util.Date;
import java.util.Scanner;

public class Address extends BaseBO{
    //region PROPERTIES
    private int AddressId;
    private int AddressNumber;
    private String Street;
    private String Street02;
    private String City;
    private int StateId;
    private int CountryId;
    private Date DateCreate;
    //endregion

    //region CONSTRUCTORS
    public Address() {}

    public Address(int addressId) {
        this.setAddressId(addressId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getAddressId() {
        return AddressId;
    }
    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public int getAddressNumberFromId(int AddressId) { return AddressNumber; }
    public int getAddressNumber() {
        return AddressNumber;
    }
    public void setAddressNumber(int addressNumber) {
        AddressNumber = addressNumber;
    }

    public String getStreetFromId(int AddressId) { return Street; }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }

    public String getStreet02FromId(int AddressId) { return Street02; }
    public String getStreet02() {
        return Street02;
    }
    public void setStreet02(String street02) {
        Street02 = street02;
    }

    public String getCityFromId(int AddressId) { return City; }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }

    public int getStateId() {
        return StateId;
    }
    public void setStateId(int stateId) {
        StateId = stateId;
    }

    public int getCountryId() {
        return CountryId;
    }
    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public Date getDateCreate() {
        return DateCreate;
    }
    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }
    //endregion
}
