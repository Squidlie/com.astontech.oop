package com.astontech.bo;

import java.util.Date;

public class Employee extends Person implements IPerson{
    //region PROPERTIES
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;
    private Date BirthDate;
    private Date CreateDate;
    private Person PersonId;
    //endregion

    //region CONSTRUCTORS
    public Employee() {}

    public Employee(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Employee(int employeeId, String firstName) {
        this.setFirstName(firstName);
    }
    public Employee(String lastName){
        this.setLastName(lastName);
    }

    //endregion

    //region GETTERS/SETTERS
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public Date getHireDate() {
        return HireDate;
    }
    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public Date getTermDate() {
        return TermDate;
    }
    public void setTermDate(Date termDate) {
        TermDate = termDate;
    }

    public Date getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Person getPerson() { return PersonId; }
    public void setPerson(Person personId) { PersonId = personId; }
    //endregion

    @Override
    public boolean isMale() {
        if (this.Gender == "male"){
            return true;
        } else
            return false;
    }


}
