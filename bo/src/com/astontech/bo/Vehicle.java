package com.astontech.bo;

import java.util.Date;

public class Vehicle extends BaseBO{
    private int VehicleId;
    private int Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private boolean IsPurchase;
    private int PurchasePrice;
    private Date PurchaseDate;
    private int VehicleModelId;

    public Vehicle() {}

    public Vehicle(int vehicleId) {
        this.setVehicleId(vehicleId);
    }

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

    public boolean isPurchase() {
        return IsPurchase;
    }
    public void setPurchase(boolean purchase) {
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

    public int getVehicleModelId() {
        return VehicleModelId;
    }
    public void setVehicleModelId(int vehicleModelId) {
        VehicleModelId = vehicleModelId;
    }
}
