package com.astontech.dao.mysql;

import com.astontech.bo.Employee;
import com.astontech.bo.Person;
import com.astontech.dao.EmployeeDAO;
import common.helpers.DateHelper;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EmployeeDAOImpl extends MySQL implements EmployeeDAO {

    @Override
    public Employee getEmployeeById(int employeeId) {
        Connect();
        Employee employee = null;
        try {
            String sp = "{call GetEmployee(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, employeeId);
            ResultSet rs = cStmt.executeQuery();

            if(rs.next()) {
                employee = HydrateObject(rs);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return employee;
        }


    @Override
    public List<Employee> getEmployeeList() {
        Connect();
        List<Employee> employeeList = new ArrayList<Employee>();
        try{
            String sp = "{call GetEmployee(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()) {
                employeeList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return employeeList;
    }

    @Override
    public int insertEmployee(Employee employee) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteEmployee(?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setDate(3, DateHelper.utilDateToSqlDate(employee.getHireDate()));
            cStmt.setDate(4, DateHelper.utilDateToSqlDate(employee.getTermDate()));
            cStmt.setDate(5, DateHelper.utilDateToSqlDate(employee.getBirthDate()));
            cStmt.setInt(6, employee.getPerson().getPersonId());
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
    public boolean updateEmployee(Employee employee) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteEmployee(?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, UPDATE);
            cStmt.setInt(2, employee.getEmployeeId());
            cStmt.setDate(3, DateHelper.utilDateToSqlDate(employee.getHireDate()));
            cStmt.setDate(4, DateHelper.utilDateToSqlDate(employee.getTermDate()));
            cStmt.setDate(5, DateHelper.utilDateToSqlDate(employee.getBirthDate()));
            cStmt.setInt(6, employee.getPerson().getPersonId());
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
    public boolean deleteEmployee(int employeeId) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecuteEmployee(?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);
            cStmt.setInt(1, DELETE);
            cStmt.setInt(2, employeeId);
            cStmt.setDate(3, DateHelper.utilDateToSqlDate(new Date(0,0,0)));
            cStmt.setDate(4, DateHelper.utilDateToSqlDate(new Date(0,0,0)));
            cStmt.setDate(5, DateHelper.utilDateToSqlDate(new Date(0,0,0)));
            cStmt.setInt(6, 0);
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx){
            logger.error(sqlEx);
        }
        return id > 0;
    }

    private static Employee HydrateObject(ResultSet rs) throws SQLException{
        /*
        EmployeeId
		 HireDate
		  TermDate
		   BirthDate
			PersonId
			 CreateDate
             */
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt(1));
        employee.setHireDate(rs.getDate(2));
        employee.setTermDate(rs.getDate(3));
        employee.setBirthDate(rs.getDate(4));
        Person person = new Person();
        person.setPersonId(rs.getInt(5));
        employee.setPerson(person);
        employee.setCreateDate(rs.getDate(6));

        return employee;
    }
}
