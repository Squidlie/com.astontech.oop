package com.astontech.dao.mysql;

import com.astontech.bo.*;
import com.astontech.dao.*;
import java.util.Date;

public class Procedures {

    //region PERSON PROCEDURES
    final static String InsertPerson(String title, String firstName, String lastName, String displayFirstName, String gender) {
        Person person = new Person();
        person.setTitle(title);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDisplayFirstName(displayFirstName);
        person.setGender(gender);

        PersonDAO personDAO = new PersonDAOImpl();
        int id = personDAO.insertPerson(person);

        return ("New Person Record Inserted. ID = " + id);
    }

    final static String UpdatePerson(int personId, String title, String firstName, String lastName, String displayFirstName, String gender){
        PersonDAO personDAO = new PersonDAOImpl();
        Person person = personDAO.getPersonById(personId);
        person.setTitle(title);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDisplayFirstName(displayFirstName);
        person.setGender(gender);

        if(personDAO.updatePerson(person)){
            return "Person Updated Successfully";
        } else{
            return "Person Update Failed!";
        }
    }

    final static String DeletePerson(int personId){
        PersonDAO personDAO = new PersonDAOImpl();

        if(personDAO.deletePerson(personId))
            return "Person Deleted Successfully";
        else
            return "Person Delete Failed!";
    }
    //endregion

    //region EMAIL PROCEDURES
    final static String InsertEmail(int emailId, String emailAddress, int employeeId, int entityTypeId){
        Email email = new Email();
        email.setEmailId(emailId);
        email.setEmailAddress(emailAddress);
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        email.setEmployeeId(employee);
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(entityTypeId);
        email.setEmailType(entityType);

        EmailDAO emailDAO = new EmailDAOImpl();
        int id = emailDAO.insertEmail(email);

        return ("New Email Record Inserted. ID = " + id);
    }

    final static String UpdateEmail(int emailId, String emailAddress, int employeeId, int entityTypeId){
        EmailDAO emailDAO = new EmailDAOImpl();
        Email email = emailDAO.getEmailById(emailId);
        email.setEmailAddress(emailAddress);
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        email.setEmployeeId(employee);
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(entityTypeId);
        email.setEmailType(entityType);

        if(emailDAO.updateEmail(email)){
            return "Email Updated Successfully";
        } else{
            return "Email Update Failed!";
        }
    }

    final static String DeleteEmail(int emailId){
        EmailDAO emailDAO = new EmailDAOImpl();

        if(emailDAO.deleteEmail(emailId))
            return "Email Deleted Successfully";
        else
            return "Email Delete Failed!";
    }
    //endregion

    //region EMPLOYEE PROCEDURES
    final static String InsertEmployee(int employeeId, Date hireDate, Date termDate, Date birthDate, int personId){
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setHireDate(hireDate);
        employee.setTermDate(termDate);
        employee.setBirthDate(birthDate);
        Person person = new Person();
        person.setPersonId(personId);
        employee.setPerson(person);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        int id = employeeDAO.insertEmployee(employee);

        return "New Employee Record Inserted. ID = " + id;
    }

    final static String UpdateEmployee(int employeeId, Date hireDate, Date termDate, Date birthDate, int personId){
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = employeeDAO.getEmployeeById(employeeId);
        employee.setHireDate(hireDate);
        employee.setTermDate(termDate);
        employee.setBirthDate(birthDate);
        Person person = new Person();
        person.setPersonId(personId);
        employee.setPerson(person);

        if(employeeDAO.updateEmployee(employee)){
            return "Employee Updated Successfully";
        } else{
            return "Employee Update Failed!";
        }
    }

    final static String DeleteEmployee(int employeeId){
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        if(employeeDAO.deleteEmployee(employeeId))
            return "Employee Deleted Successfully";
        else
            return "Employee Delete Failed!";
    }
    //endregion

    //region PHONE PROCEDURES
    final static String InsertPhone(int phoneId, int entityTypeId, int clientId, int personId, int areaCode, int phoneNumber, int phoneNumberPost){
        Phone phone = new Phone();
        phone.setPhoneId(phoneId);
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(entityTypeId);
        phone.setEntityTypeId(entityType);
        Client client = new Client();
        client.setClientId(clientId);
        phone.setClientId(client);
        Person person = new Person();
        person.setPersonId(personId);
        phone.setPersonId(person);
        phone.setAreaCode(areaCode);
        phone.setPhoneNumber(phoneNumber);
        phone.setPhoneNumberPost(phoneNumberPost);

        PhoneDAO phoneDAO = new PhoneDAOImpl();
        int id = phoneDAO.insertPhone(phone);

        return "New Phone Record Inserted. ID = " + id;
    }

    final static String UpdatePhone(int phoneId, int entityTypeId, int clientId, int personId, int areaCode, int phoneNumber, int phoneNumberPost) {
        PhoneDAO phoneDAO = new PhoneDAOImpl();
        Phone phone = phoneDAO.getPhoneById(phoneId);
        EntityType entityType = new EntityType();
        entityType.setEntityTypeId(entityTypeId);
        phone.setEntityTypeId(entityType);
        Client client = new Client();
        client.setClientId(clientId);
        phone.setClientId(client);
        Person person = new Person();
        person.setPersonId(personId);
        phone.setPersonId(person);
        phone.setAreaCode(areaCode);
        phone.setPhoneNumber(phoneNumber);
        phone.setPhoneNumberPost(phoneNumberPost);

        if (phoneDAO.updatePhone(phone)) {
            return "Phone Updated Successfully";
        } else {
            return "Phone Update Failed!";
        }
    }

    final static String DeletePhone(int phoneId){
            PhoneDAO PhoneDAO = new PhoneDAOImpl();

            if(PhoneDAO.deletePhone(phoneId))
                return "Phone Deleted Successfully";
            else
                return "Phone Delete Failed!";
    }
    //endregion

    //region VEHICLE PROCEDURES
    final static String InsertVehicle(int vehicleId, int year, String licensePlate, String vin, String color, boolean isPurchase, int purchasePrice, Date purchaseDate, int vehicleModelId){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(vehicleId);
        vehicle.setYear(year);
        vehicle.setLicensePlate(licensePlate);
        vehicle.setVIN(vin);
        vehicle.setColor(color);
        vehicle.setIsPurchase(isPurchase);
        vehicle.setPurchasePrice(purchasePrice);
        vehicle.setPurchaseDate(purchaseDate);
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setVehicleModelId(vehicleModelId);
        vehicle.setVehicleModelId(vehicleModel);

        VehicleDAO vehicleDAO = new VehicleDAOImpl();
        int id = vehicleDAO.insertVehicle(vehicle);

        return "New Vehicle Record Inserted. ID = " + id;
    }

    final static String UpdateVehicle(int vehicleId, int year, String licensePlate, String vin, String color, boolean isPurchase, int purchasePrice, Date purchaseDate, int vehicleModelId){
        VehicleDAO vehicleDAO = new VehicleDAOImpl();
        Vehicle vehicle = vehicleDAO.getVehicleById(vehicleId);
        vehicle.setYear(year);
        vehicle.setLicensePlate(licensePlate);
        vehicle.setVIN(vin);
        vehicle.setColor(color);
        vehicle.setIsPurchase(isPurchase);
        vehicle.setPurchasePrice(purchasePrice);
        vehicle.setPurchaseDate(purchaseDate);
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setVehicleModelId(vehicleModelId);
        vehicle.setVehicleModelId(vehicleModel);

        if(vehicleDAO.updateVehicle(vehicle)){
            return "Vehicle Updated Successfully";
        } else{
            return "Vehicle Update Failed!";
        }
    }

    final static String DeleteVehicle(int vehicleId){
        VehicleDAO vehicleDAO = new VehicleDAOImpl();

        if(vehicleDAO.deleteVehicle(vehicleId))
            return "Vehicle Deleted Successfully";
        else
            return "Vehicle Delete Failed!";
    }
    //endregion

    //region VEHICLE MAKE PROCEDURES
    final static String InsertVehicleMake(int vehicleMakeId, String vehicleMakeName, Date createDate){
        VehicleMake vehicleMake = new VehicleMake();
        vehicleMake.setVehicleMakeId(vehicleMakeId);
        vehicleMake.setVehicleMakeName(vehicleMakeName);
        vehicleMake.setCreateDate(createDate);

        VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDAOImpl();
        int id = vehicleMakeDAO.insertVehicleMake(vehicleMake);

        return "New Vehicle Make Record Inserted. ID = " + id;
    }

    final static String UpdateVehicleMake(int vehicleMakeId, String vehicleMakeName, Date createDate){
        VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDAOImpl();
        VehicleMake vehicleMake = vehicleMakeDAO.getVehicleMakeById(vehicleMakeId);
        vehicleMake.setVehicleMakeName(vehicleMakeName);
        vehicleMake.setCreateDate(createDate);

        if(vehicleMakeDAO.updateVehicleMake(vehicleMake)){
            return "Vehicle Make Updated Successfully";
        } else{
            return "Vehicle Make Update Failed!";
        }
    }

    final static String DeleteVehicleMake(int vehicleMakeId){
        VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDAOImpl();

        if(vehicleMakeDAO.deleteVehicleMake(vehicleMakeId))
            return "Vehicle Make Deleted Successfully";
        else
            return "Vehicle Make Delete Failed!";
    }
    //endregion

    //region VEHICLE MODEL PROCEDURES
    final static String InsertVehicleModel(int vehicleModelId, String vehicleModelName, int vehicleMakeId){
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setVehicleModelId(vehicleModelId);
        vehicleModel.setVehicleModelName(vehicleModelName);
        VehicleMake vehicleMake = new VehicleMake();
        vehicleMake.setVehicleMakeId(vehicleMakeId);
        vehicleModel.setVehicleMakeId(vehicleMake);

        VehicleModelDAO vehicleModelDAO = new VehicleModelDAOImpl();
        int id = vehicleModelDAO.insertVehicleModel(vehicleModel);

        return "New Vehicle Model Record Inserted. ID = " + id;
    }

    final static String UpdateVehicleModel(int vehicleModelId, String vehicleModelName, int vehicleMakeId){
        VehicleModelDAO vehicleModelDAO = new VehicleModelDAOImpl();
        VehicleModel vehicleModel = vehicleModelDAO.getVehicleModelById(vehicleModelId);
        vehicleModel.setVehicleModelName(vehicleModelName);
        VehicleMake vehicleMake = new VehicleMake();
        vehicleMake.setVehicleMakeId(vehicleMakeId);
        vehicleModel.setVehicleMakeId(vehicleMake);

        if(vehicleModelDAO.updateVehicleModel(vehicleModel)){
            return "Vehicle Model Updated Successfully";
        } else{
            return "Vehicle Model Update Failed!";
        }
    }

    final static String DeleteVehicleModel(int vehicleModelId){
        VehicleModelDAO vehicleModelDAO2 = new VehicleModelDAOImpl();

        if(vehicleModelDAO2.deleteVehicleModel(vehicleModelId))
            return "Vehicle Model Deleted Successfully";
        else
            return "Vehicle Model Delete Failed!";
    }
    //endregion
}
