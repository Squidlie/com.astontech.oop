package com.astontech.bo;

import java.util.Date;

public class ProjectStatus extends BaseBO{
    //region PROPERTIES
    private int ProjectStatusId;
    private Project ProjectId;
    private EntityType EntityTypeId;
    private String Notes;
    private int PercentComplete;
    private Date StartDate;
    private Date EndDate;
    //endregion

    //region CONSTRUCTORS
    public ProjectStatus() {}

    public ProjectStatus(int projectStatusId) {
        this.setProjectStatusId(projectStatusId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getProjectStatusId() {
        return ProjectStatusId;
    }
    public void setProjectStatusId(int projectStatusId) {
        ProjectStatusId = projectStatusId;
    }

    public Project getProjectId() {
        return ProjectId;
    }
    public void setProjectId(Project projectId) {
        ProjectId = projectId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public String getNotes() {
        return Notes;
    }
    public void setNotes(String notes) {
        Notes = notes;
    }

    public int getPercentComplete() {
        return PercentComplete;
    }
    public void setPercentComplete(int percentComplete) {
        PercentComplete = percentComplete;
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
    //endregion
}
