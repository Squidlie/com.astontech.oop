package com.astontech.bo;

import java.util.Date;

public class EmployeeProject extends BaseBO{
    //region PROPERTIES
    private int EmployeeProjectId;
    private Project ProjectId;
    private Employee EmployeeId;
    private EntityType EntityTypeId;
    private Vehicle VehicleId;
    private Date StartDate;
    private Date EndDate;
    private String Notes;
    //endregion

    //region CONSTRUCTORS
    public EmployeeProject() {}

    public EmployeeProject(int employeeProjectId) {
        this.setEmployeeProjectId(employeeProjectId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getEmployeeProjectId() {
        return EmployeeProjectId;
    }
    public void setEmployeeProjectId(int employeeProjectId) {
        EmployeeProjectId = employeeProjectId;
    }

    public Project getProjectId() {
        return ProjectId;
    }
    public void setProjectId(Project projectId) {
        ProjectId = projectId;
    }

    public Employee getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(Employee employeeId) {
        EmployeeId = employeeId;
    }

    public EntityType getEntityTypeId() {
        return EntityTypeId;
    }
    public void setEntityTypeId(EntityType entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public Vehicle getVehicleId() {
        return VehicleId;
    }
    public void setVehicleId(Vehicle vehicleId) {
        VehicleId = vehicleId;
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

    public String getNotes() {
        return Notes;
    }
    public void setNotes(String notes) {
        Notes = notes;
    }
    //endregion
}
