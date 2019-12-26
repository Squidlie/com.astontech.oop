package com.astontech.bo;

import common.helpers.StringHelper;

import java.util.ArrayList;
import java.util.List;

public class Person extends BaseBO implements Comparable, IPerson, java.io.Serializable{

    //region PROPERTIES
    private int PersonId;
    private String Title;
    private String FirstName;
    private String LastName;
    private String DisplayFirstName;
    public transient String Gender;
    private List<Email> Emails;

    private static final long serialVersionUID = 54622233600l;
    //endregion

    //region CONSTRUCTORS
    public Person() {
        this.setEmails(new ArrayList<>());
    }

    //endregion

    //region GETTERS/SETTERS
    public void setPersonId(int personId) {
        this.PersonId = personId;
    }
    public int getPersonId() {
        return this.PersonId;
    }

    public void setTitle(String title) {
        this.Title = title;
    }
    public String getTitle() {
        return this.Title;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }
    public String getFirstName() {
        return this.FirstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    public String getLastName() {
        return this.LastName;
    }

    public void setDisplayFirstName(String displayFirstName) {
        this.DisplayFirstName = displayFirstName;
    }
    public String getDisplayFirstName() {
        return this.DisplayFirstName;
    }

    public void setGender(String gender) {
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


    public String getFullName() {
        if (StringHelper.isNullOrEmpty(this.FirstName) && StringHelper.isNullOrEmpty(this.LastName))
            return "No Name Set";
        else {
            if (StringHelper.isNullOrEmpty(this.FirstName))
                return this.LastName;
            else if (StringHelper.isNullOrEmpty(this.LastName))
                return this.FirstName;
            else
                return this.FirstName + " " + this.LastName;
        }

    }

    public String ToString(){
        return "PersonId=" + this.PersonId + " Full Name=" + this.getFullName() + " Gender=" + this.Gender;
    }

    @Override
    public boolean isMale() {
        if (this.Gender == "male"){
            return true;
        } else
            return false;
    }


    public int compareTo(Object temp) {
        Person other = (Person) temp;

        if (this.getPersonId() > other.getPersonId()) {
            return 1;
        } else if (this.getPersonId() < other.getPersonId()){
            return -1;
        } else return 0;
    }
}

