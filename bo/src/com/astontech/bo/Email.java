package com.astontech.bo;

import java.util.Scanner;

public class Email extends BaseBO {
    private int EmailId;
    private String EmailAddress;
    private int EmployeeId;
    private int EntityTypeId;

    public Email() {}

    public Email(int emailId) {
        this.setEmailId(emailId);
    }

    private void LABMethodTwo(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an Email Address");
        String input = reader.nextLine();
        getEmailIdFromEmail(input);
    }

    public int getEmailIdFromEmail(String EmailAddress) {
        return EmailId;
    }
    public int getEmailId() {
        return EmailId;
    }
    public void setEmailId(int emailId) {
        EmailId = emailId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }
}
