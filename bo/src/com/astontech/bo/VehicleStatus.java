package com.astontech.bo;

import java.util.Date;

public class VehicleStatus extends BaseBO{
    //region PROPERTIES
    private int VehicleStatusId;
    private Vehicle VehicleId;
    private EntityType EntityTypeId;
    private String Notes;
    private Date CreateDate;
    //endregion

    //region CONSTRUCTOR
    public VehicleStatus() {}

    public VehicleStatus(int vehicleStatusId) {
        this.setVehicleStatusId(vehicleStatusId);
    }
    //endregion

    //region GETTER/SETTER
    public int getVehicleStatusId() {
        return VehicleStatusId;
    }
    public void setVehicleStatusId(int vehicleStatusId) {
        VehicleStatusId = vehicleStatusId;
    }

    public Vehicle getVehicleId() {
        return VehicleId;
    }
    public void setVehicleId(Vehicle vehicleId) {
        VehicleId = vehicleId;
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

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
    //endregion
}
