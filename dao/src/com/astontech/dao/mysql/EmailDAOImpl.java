package com.astontech.dao.mysql;

import com.astontech.bo.*;
import com.astontech.dao.EmailDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmailDAOImpl extends MySQL implements EmailDAO {
    @Override
    public Email getEmailById(int emailId) {
        Connect();
        Email email = null;
        try {
            String sp = "{call GetEmail(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, emailId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                email = HydrateObject(rs);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return email;
    }

    @Override
    public List<Email> getEmailList() {
        Connect();
        List<Email> emailList = new ArrayList<Email>();
        try{
            String sp = "{call GetEmail(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {
                emailList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return emailList;
    }

    @Override
    public int insertEmail(Email email) {
        return 0;
    }

    @Override
    public boolean updateEmail(Email email) {
        return false;
    }

    @Override
    public boolean deleteEmail(int emailId) {
        return false;
    }
    private static Email HydrateObject(ResultSet rs) throws SQLException{
        Email email = new Email();
        email.setEmailId(rs.getInt(1));
        email.setEmailAddress(rs.getString(2));
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt(3));
        email.setEmployeeId(employee);
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(rs.getInt(4));
        email.setEmailType(entityType);

        return email;
    }
}
