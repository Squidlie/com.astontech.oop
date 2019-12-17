package com.astontech.bo;

import java.util.Date;

public class VehicleMake extends BaseBO{
    private int VehicleMakeId;
    private String VehicleMakeName;
    private Date CreateDate;

    public VehicleMake() {}

    public VehicleMake(int vehicleMakeId) {
        this.setVehicleMakeId(vehicleMakeId);
    }

    public int getVehicleMakeId() {
        return VehicleMakeId;
    }
    public void setVehicleMakeId(int vehicleMakeId) {
        VehicleMakeId = vehicleMakeId;
    }

    public String getVehicleMakeName() {
        return VehicleMakeName;
    }
    public void setVehicleMakeName(String vehicleMakeName) {
        VehicleMakeName = vehicleMakeName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
