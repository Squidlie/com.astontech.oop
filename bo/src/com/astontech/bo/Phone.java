package com.astontech.bo;

import java.util.Scanner;

public class Phone extends BaseBO{
    private int PhoneId;
    private int EntityTypeId;
    private int ClientId;
    private int PersonId;
    private int AreaCode;
    private int PhoneNumber;
    private int PhoneNumberPost;

    public Phone() {}

    public Phone(int phoneId) {
        this.setPhoneId(phoneId);
    }

    private void LABMethodOne(){
        // gets all phone info for an Id
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Client ID");
        String inputId = reader.nextLine();
        int inputtedId = Integer.parseInt(inputId);
        System.out.println(getPhoneIdFromClient(inputtedId));
        System.out.println(getEntityTypeIdFromClient(inputtedId));
        System.out.println(getPersonIdFromClient(inputtedId));
        System.out.println(getAreaCodeFromClient(inputtedId));
        System.out.println(getPhoneNumberFromClient(inputtedId));
        System.out.println(getPhoneNumberPostFromClient(inputtedId));
    }

    public int getPhoneIdFromClient(int ClientId) {
        return PhoneId;
    }
    public int getPhoneId() {
        return PhoneId;
    }
    public void setPhoneId(int phoneId) {
        PhoneId = phoneId;
    }

    public int getEntityTypeIdFromClient(int ClientId) {
        return EntityTypeId;
    }
    public int getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public int getClientId() {
        return ClientId;
    }
    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getPersonIdFromClient(int ClientId) {
        return PersonId;
    }
    public int getPersonId() {
        return PersonId;
    }
    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public int getAreaCodeFromClient(int ClientId) {
        return AreaCode;
    }
    public int getAreaCode() {
        return AreaCode;
    }
    public void setAreaCode(int areaCode) {
        AreaCode = areaCode;
    }

    public int getPhoneNumberFromClient(int ClientId) {
        return PhoneNumber;
    }
    public int getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getPhoneNumberPostFromClient(int ClientId) {
        return PhoneNumberPost;
    }
    public int getPhoneNumberPost() {
        return PhoneNumberPost;
    }
    public void setPhoneNumberPost(int phoneNumberPost) {
        PhoneNumberPost = phoneNumberPost;
    }
}
