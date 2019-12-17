package com.astontech.bo;

public class VehicleModel extends BaseBO{
    //region PROPERTIES
    private int VehicleModelId;
    private String VehicleModelName;
    private VehicleMake VehicleMakeId;
    //endregion

    //region CONSTRUCTORS
    public VehicleModel() {}

    public VehicleModel(int vehicleModelId) {
        this.setVehicleModelId(vehicleModelId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getVehicleModelId() {
        return VehicleModelId;
    }
    public void setVehicleModelId(int vehicleModelId) {
        VehicleModelId = vehicleModelId;
    }

    public String getVehicleModelName() {
        return VehicleModelName;
    }
    public void setVehicleModelName(String vehicleModelName) {
        VehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMakeId() {
        return VehicleMakeId;
    }
    public void setVehicleMakeId(VehicleMake vehicleMakeId) {
        VehicleMakeId = vehicleMakeId;
    }
    //endregion
}
