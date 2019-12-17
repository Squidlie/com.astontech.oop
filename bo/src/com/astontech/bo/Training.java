package com.astontech.bo;

import java.util.Date;

public class Training extends BaseBO{
    //region PROPERTIES
    private int TrainingId;
    private Employee EmployeeId;
    private String TrainingName;
    private Date CreateDate;
    //endregion

    //region CONSTRUCTORS
    public Training() {}

    public Training(int trainingId) {
        this.setTrainingId(trainingId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getTrainingId() {
        return TrainingId;
    }
    public void setTrainingId(int trainingId) {
        TrainingId = trainingId;
    }

    public Employee getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        EmployeeId = employeeId;
    }

    public String getTrainingName() {
        return TrainingName;
    }
    public void setTrainingName(String trainingName) {
        TrainingName = trainingName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
    //endregion
}
