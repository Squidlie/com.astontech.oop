package com.astontech.bo;

public class Phone extends BaseBO{
    //region PROPERTIES
    private int PhoneId;
    private EntityType EntityTypeId;
    private Client ClientId;
    private Person PersonId;
    private int AreaCode;
    private int PhoneNumber;
    private int PhoneNumberPost;
    //endregion

    //region CONSTRUCTORS
    public Phone() {}

    public Phone(int phoneId) {
        this.setPhoneId(phoneId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getPhoneId() {
        return PhoneId;
    }
    public void setPhoneId(int phoneId) {
        PhoneId = phoneId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public Client getClientId() {
        return ClientId;
    }
    public void setClientId(Client clientId) {
        ClientId = clientId;
    }

    public Person getPersonId() {
        return PersonId;
    }
    public void setPersonId(Person personId) {
        PersonId = personId;
    }

    public int getAreaCode() {
        return AreaCode;
    }
    public void setAreaCode(int areaCode) {
        AreaCode = areaCode;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getPhoneNumberPost() {
        return PhoneNumberPost;
    }
    public void setPhoneNumberPost(int phoneNumberPost) {
        PhoneNumberPost = phoneNumberPost;
    }
    //endregion
}
