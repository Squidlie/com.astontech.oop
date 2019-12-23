package com.astontech.dao.mysql;

import com.astontech.bo.Vehicle;
import com.astontech.bo.VehicleMake;
import com.astontech.bo.VehicleModel;
import com.astontech.dao.VehicleModelDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleModelDAOImpl extends MySQL implements VehicleModelDAO {

    @Override
    public VehicleModel getVehicleModelById(int vehicleModelId) {
        Connect();
        VehicleModel vehicleModel = null;
        try {
            String sp = "{call GetVehicleModel(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, vehicleModelId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                vehicleModel = HydrateObject(rs);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return vehicleModel;
    }

    @Override
    public List<VehicleModel> getVehicleModelList() {
        Connect();
        List<VehicleModel> vehicleModelList = new ArrayList<VehicleModel>();
        try{
            String sp = "{call GetVehicleModel(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {
                vehicleModelList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return vehicleModelList;
    }

    @Override
    public int insertVehicleModel(VehicleModel vehicleModel) {
        return 0;
    }

    @Override
    public boolean updateVehicleModel(VehicleModel vehicleModel) {
        return false;
    }

    @Override
    public boolean deleteVehicleModel(int vehicleModelId) {
        return false;
    }
    private static VehicleModel HydrateObject(ResultSet rs) throws SQLException {
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setVehicleModelId(rs.getInt(1));
        vehicleModel.setVehicleModelName(rs.getString(2));
        VehicleMake vehicleMake = new VehicleMake();
        vehicleMake.setVehicleMakeId(rs.getInt(3));
        vehicleModel.setVehicleMakeId(vehicleMake);

        return vehicleModel;
    }
}
