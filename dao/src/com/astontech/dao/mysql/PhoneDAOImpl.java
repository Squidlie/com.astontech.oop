package com.astontech.dao.mysql;

import com.astontech.bo.*;
import com.astontech.dao.PhoneDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAOImpl extends MySQL implements PhoneDAO {

    @Override
    public Phone getPhoneById(int phoneId) {
        Connect();
        Phone phone = null;
        try {
            String sp = "{call GetPhone(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, phoneId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                phone = HydrateObject(rs);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return phone;
    }

    @Override
    public List<Phone> getPhoneList() {
            Connect();
            List<Phone> phoneList = new ArrayList<Phone>();
            try{
                String sp = "{call GetPhone(?,?)}";
                CallableStatement cStmt = connection.prepareCall(sp);

                cStmt.setInt(1, GET_COLLECTION);
                cStmt.setInt(2, 0);
                ResultSet rs = cStmt.executeQuery();

                while(rs.next()) {
                    phoneList.add(HydrateObject(rs));
                }
            } catch (SQLException sqlEx){
                logger.error(sqlEx);
            }
            return phoneList;
        }

    @Override
    public int insertPhone(Phone phone) {
        return 0;
    }

    @Override
    public boolean updatePhone(Phone phone) {
        return false;
    }

    @Override
    public boolean deletePhone(int phoneId) {
        return false;
    }

    private static Phone HydrateObject(ResultSet rs) throws SQLException{
        Phone phone = new Phone();
        phone.setPhoneId(rs.getInt(1));
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(rs.getInt(2));
        phone.setEntityTypeId(entityType);
        Client client = new Client();
        client.setClientId(rs.getInt(3));
        phone.setClientId(client);
        Person person = new Person();
        person.setPersonId(rs.getInt(4));
        phone.setPersonId(person);
        phone.setAreaCode(rs.getInt(5));
        phone.setPhoneNumber(rs.getInt(6));
        phone.setPhoneNumberPost(rs.getInt(7));

        return phone;
    }
}
