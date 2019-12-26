package com.astontech.dao.mysql;

import com.astontech.bo.*;
import com.astontech.dao.VehicleDAO;
import common.helpers.DateHelper;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleDAOImpl extends MySQL implements VehicleDAO {

    @Override
    public Vehicle getVehicleById(int vehicleId) {
        Connect();
        Vehicle vehicle = null;
        try {
            String sp = "{call GetVehicle(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, vehicleId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                vehicle = HydrateObject(rs);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return vehicle;
    }

    @Override
    public List<Vehicle> getVehicleList() {
        Connect();
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        try{
            String sp = "{call GetVehicle(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {
                vehicleList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return vehicleList;
    }

    @Override
    public int insertVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteVehicle(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setInt(3, vehicle.getYear());
            cStmt.setString(4, vehicle.getLicensePlate());
            cStmt.setInt(5, Integer.parseInt(vehicle.getVIN()));
            cStmt.setString(6, vehicle.getColor());
            cStmt.setBoolean(7, vehicle.getIsPurchase());
            cStmt.setInt(8, vehicle.getPurchasePrice());
            cStmt.setDate(9, DateHelper.utilDateToSqlDate(vehicle.getPurchaseDate()));
            cStmt.setInt(10, vehicle.getVehicleModelId().getVehicleModelId());
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return id;
    }

    @Override
    public boolean updateVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteVehicle(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, UPDATE);
            cStmt.setInt(2, vehicle.getVehicleId());
            cStmt.setInt(3, vehicle.getYear());
            cStmt.setString(4, vehicle.getLicensePlate());
            cStmt.setInt(5, Integer.parseInt(vehicle.getVIN()));
            cStmt.setString(6, vehicle.getColor());
            cStmt.setBoolean(7, vehicle.getIsPurchase());
            cStmt.setInt(8, vehicle.getPurchasePrice());
            cStmt.setDate(9, DateHelper.utilDateToSqlDate(vehicle.getPurchaseDate()));
            cStmt.setInt(10, vehicle.getVehicleModelId().getVehicleModelId());
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return id > 0;
    }

    @Override
    public boolean deleteVehicle(int vehicleId) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteVehicle(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, DELETE);
            cStmt.setInt(2, vehicleId);
            cStmt.setInt(3, 0);
            cStmt.setString(4, "");
            cStmt.setInt(5, 0);
            cStmt.setString(6, "");
            cStmt.setBoolean(7, false);
            cStmt.setInt(8, 0);
            cStmt.setDate(9, DateHelper.utilDateToSqlDate(new Date(0,0,0)));
            cStmt.setInt(10, 0);
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return id > 0;
    }

    private static Vehicle HydrateObject(ResultSet rs) throws SQLException {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(rs.getInt(1));
        vehicle.setYear(rs.getInt(2));
        vehicle.setLicensePlate(rs.getString(3));
        vehicle.setVIN(rs.getString(4));
        vehicle.setColor(rs.getString(5));
        vehicle.setIsPurchase(rs.getBoolean(6));
        vehicle.setPurchasePrice(rs.getInt(7));
        vehicle.setPurchaseDate(rs.getDate(8));
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setVehicleModelId(rs.getInt(9));
        vehicle.setVehicleModelId(vehicleModel);

        return vehicle;
    }
}
