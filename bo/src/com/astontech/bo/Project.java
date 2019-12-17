package com.astontech.bo;

import java.util.Date;

public class Project extends BaseBO{
    //region PROPERTIES
    private int ProjectId;
    private Client ClientId;
    private EntityType EntityTypeId;
    private int Rate;
    private Date StartDate;
    private Date EndDate;
    private String ProjectName;
    //endregion

    //region CONSTRUCTORS
    public Project() {}

    public Project(int projectId) {
        this.setProjectId(projectId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getProjectId() {
        return ProjectId;
    }
    public void setProjectId(int projectId) {
        ProjectId = projectId;
    }

    public Client getClientId() {
        return ClientId;
    }
    public void setClientId(Client clientId) {
        ClientId = clientId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public int getRate() {
        return Rate;
    }
    public void setRate(int rate) {
        Rate = rate;
    }

    public Date getStartDate() {
        return StartDate;
    }
    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }
    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getProjectName() {
        return ProjectName;
    }
    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
    //endregion
}
