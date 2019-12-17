package com.astontech.bo;

import java.util.ArrayList;
import java.util.List;

public class Person extends BaseBO{

    //region PROPERTIES
    private int PersonId;
    private String Title;
    private String FirstName;
    private String LastName;
    private String DisplayFirstName;
    private String Gender;
    private List<Email> Emails;
    //endregion

    //region CONSTRUCTORS
    public Person() {
        this.setEmails(new ArrayList<>());
    }

    //endregion

    //region GETTERS/SETTERS
    public void setPersonId(int personId){
        this.PersonId = personId;
    }
    public int getPersonId() {
        return this.PersonId;
    }

    public void setTitle(String title){
        this.Title = title;
    }
    public String getTitle() {
        return this.Title;
    }

    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }
    public String getFirstName() {
        return this.FirstName;
    }

    public void setLastName(String lastName){
        this.LastName = lastName;
    }
    public String getLastName() {
        return this.LastName;
    }

    public void setDisplayFirstName(String displayFirstName){
        this.DisplayFirstName = displayFirstName;
    }
    public String getDisplayFirstName() {
        return this.DisplayFirstName;
    }

    public void setGender(String gender){
        this.Gender = gender;
    }
    public String getGender() {
        return this.Gender;
    }

    public List<Email> getEmails() {
        return Emails;
    }
    public void setEmails(List<Email> emails) {
        Emails = emails;
    }
    //endregion

    //region CUSTOM METHODS
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public String getFullName() {
        if(isNullOrEmpty(this.FirstName) && isNullOrEmpty(this.LastName))
            return "No Name Set";
        else
            {
                if(isNullOrEmpty(this.FirstName))
                    return this.LastName;
                else if(isNullOrEmpty(this.LastName))
                    return this.FirstName;
                else
                    return this.FirstName + " " + this.LastName;
            }

    }


    //endregion

}

