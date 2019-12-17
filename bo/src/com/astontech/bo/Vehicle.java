package com.astontech.bo;

import java.util.Date;

public class Vehicle extends BaseBO{
    //region PROPERTIES
    private int VehicleId;
    private int Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private boolean IsPurchase;
    private int PurchasePrice;
    private Date PurchaseDate;
    private VehicleModel VehicleModel;
    //endregion

    //region CONSTRUCTORS
    public Vehicle() {}

    public Vehicle(int vehicleId) {
        this.setVehicleId(vehicleId);
    }
    //endregion

    //region GETTERS/SETTERS
    public int getVehicleId() {
        return VehicleId;
    }
    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }

    public boolean getIsPurchase() {
        return IsPurchase;
    }
    public void setIsPurchase(boolean purchase) {
        IsPurchase = purchase;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }
    public void setPurchasePrice(int purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public VehicleModel getVehicleModelId() {
        return VehicleModel;
    }
    public void setVehicleModelId(VehicleModel vehicleModelId) {
        VehicleModel = vehicleModelId;
    }
    //endregion
}
