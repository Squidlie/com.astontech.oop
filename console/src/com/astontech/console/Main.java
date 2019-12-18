package com.astontech.console;

import java.util.*;
import com.astontech.bo.*;
import com.astontech.common.Math;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        OOPPrinciplesLab4();

    }

    private static void OOPPrinciplesLab4(){
        /*  Number 1
        Static is a way to Instantiate something automatically within code. It does this at runtime.
        An Instance is any occurrence of an object or method. If something is not static, it must be instanced
        to be used. Examples can be found in the notes of LessonInstanceVsStatic

            Number 2
        Only primitive data types are value types, references simply point to data. If I create a reference object,
        any additional objects created that equal the first object will not update the object, but if I set
        a value type to be equal to a second object, the second object does create its own data/object. This
        is sometimes referred to as cloning. Examples can be found in the notes of LessonValueVsRef()


            Number 3:
         */

        System.out.println("---HASH TABLE---");
        Hashtable<Integer, String> labHashTable = new Hashtable<>();
        labHashTable.put(1, "What's the easiest way for an object to become wealthy?    Inheritance");
        labHashTable.put(2, "Why did the programmer quit his job?                       He couldn't get arrays");
        labHashTable.put(3, "Why did the programmer start smoking cigarettes?           He never listens to warnings, only errors.");
        labHashTable.put(4, "Why didn't the programmer finish his shower?               His shampoo directions said 'Lather, Rinse, Repeat'");

        for (Integer key : labHashTable.keySet()) {
            System.out.println(labHashTable.get(key));
        }
        System.out.println("----------------");

        System.out.println("---HASH MAP---");
        HashMap<Integer, String> labHashMap = new HashMap<>();
        labHashMap.put(1, "An SQL Query walks into a bar, walks up to two tables and says, 'Mind if I join you?'");
        labHashMap.put(2, "What's the most used Language in programming?                    Profanity");
        labHashMap.put(3, "Why did the database administrator leave his wife?               She had a one-to-many relationship.");
        labHashMap.put(4,null);

        for (Integer key : labHashMap.keySet()) {
            System.out.println(labHashMap.get(key));
        }
        System.out.println("----------------");

        System.out.println("---HASH SET---");
        HashSet<String> labHashSet = new HashSet<>();
        labHashSet.add("Inheritance");
        labHashSet.add("Polymorphism");
        labHashSet.add("Abstraction");
        labHashSet.add("Encapsulation");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");
        labHashSet.add("Recurrence");

        for(String s : labHashSet){
            System.out.println(s);
        }
    }

    private static void LessonValueVsRef(){
        //This is a reference type, so the secondEmp value is simply another name for the created firstEmp object
        Employee firstEmp = new Employee();
        firstEmp.setFirstName("Bipin");

        Employee secondEmp = firstEmp;
        firstEmp.setFirstName("Dan");
        secondEmp.setFirstName("Bob");

        System.out.println(secondEmp.getFirstName());

        //This is a value type, so firstInt and secondInt are saved as separate values.
        int firstInt = 10;
        int secondInt = firstInt;

        firstInt = 20;

        System.out.println(secondInt);
    }

    private static void LessonHash() {

        System.out.println("---HASH TABLE---");
        Hashtable<Integer, String> firstHashTable = new Hashtable<>();
        firstHashTable.put(1, "Inheritance");
        firstHashTable.put(2, "Polymorphism");
        firstHashTable.put(3, "Abstraction");
        firstHashTable.put(4, "Encapsulation");

        System.out.println("Value from given key: " + firstHashTable.get(3));
        for (Integer key : firstHashTable.keySet()) {
            System.out.println("key: " + key + " - value: " + firstHashTable.get(key));
        }
        System.out.println("----------------");


        System.out.println("---HASH MAP---");
        HashMap<Integer, String> firstHashMap = new HashMap<>();
        firstHashMap.put(1, "Inheritance");
        firstHashMap.put(2, "Polymorphism");
        firstHashMap.put(3, "Abstraction");
        firstHashMap.put(4, "Encapsulation");
        firstHashMap.put(6, "Encapsulation");
        firstHashMap.put(5,null);

        System.out.println("Value from given key: " + firstHashMap.get(3));
        for (Integer key : firstHashMap.keySet()) {
            System.out.println("key: " + key + " - value: " + firstHashMap.get(key));
        }
        System.out.println("----------------");


        System.out.println("---HASH SET---");
        HashSet<String> firstHashSet = new HashSet<>();
        firstHashSet.add("Inheritance");
        firstHashSet.add("Polymorphism");
        firstHashSet.add("Abstraction");
        firstHashSet.add("Encapsulation");
        firstHashSet.add("Encapsulation");

        if(firstHashSet.contains("Encapsulation"))
            System.out.println("value exists");
        else
            System.out.println("value does not exist");

        for(String s : firstHashSet){
            System.out.println(s);
        }

    }

    private static void LessonPolymorphism(){
        BaseBO baseBo = new BaseBO();
        System.out.println(baseBo.test_method());

        EntityType entityType = new EntityType();
        System.out.println(entityType.test_method());
    }

    private static void LessonInstanceVsStatic(){
        /*
        If my Math were not static, ex:
            public final double E = 2.71;
            public final double PI = 3.14;

            public int square(int val){
            return val * val;}
        I would have to instance it before being able to use it like I do in the active code below. ex:

        Math InstanceOfMathClass = new Math(); --Here I am creating an instance I can then use to access
                                                 the methods within Math. I have to call this instance each
                                                 time I intend to use these methods.
        System.out.println(InstanceOfMathClass.E);
        System.out.println(InstanceOfMathClass.E);

        System.out.println(InstanceOfMathClass.square(4);

         */

        //Because Math() is declared as static in Math.java, I do not have to instance it before using it
        System.out.println(Math.E);
        System.out.println(Math.PI);

        System.out.println(Math.square(4));
    }

    private static void LessonCollectionsLAB(){
        Vehicle vehicleOne = new Vehicle(1);
        VehicleModel vehicleModelOne = new VehicleModel(1);
        vehicleOne.setVehicleId(1);
        vehicleOne.setYear(1999);
        vehicleOne.setLicensePlate("BDU638");
        vehicleOne.setVIN("GHJ236T910IJDFNBG");
        vehicleOne.setColor("Yellow");
        vehicleOne.setIsPurchase(true);
        vehicleOne.setPurchasePrice(15000);
        vehicleOne.setPurchaseDate(new Date(99, 7, 18));
        vehicleOne.setVehicleModelId(new VehicleModel(1));
        vehicleModelOne.setVehicleModelName("F-150");


        System.out.println(vehicleOne.getVehicleId());
        System.out.println(vehicleOne.getYear());
        System.out.println(vehicleOne.getLicensePlate());
        System.out.println(vehicleOne.getVIN());
        System.out.println(vehicleOne.getColor());
        System.out.println(vehicleOne.getIsPurchase());
        System.out.println(vehicleOne.getPurchasePrice());
        System.out.println(vehicleOne.getPurchaseDate());
        System.out.println(vehicleModelOne.getVehicleModelName());
        System.out.println("");


        Vehicle vehicleTwo = new Vehicle(2);
        VehicleModel vehicleModelTwo = new VehicleModel(2);
        vehicleTwo.setVehicleId(2);
        vehicleTwo.setYear(2010);
        vehicleTwo.setLicensePlate("KLW832");
        vehicleTwo.setVIN("5S2H8EE2A945LHCSA");
        vehicleTwo.setColor("Red");
        vehicleTwo.setIsPurchase(true);
        vehicleTwo.setPurchasePrice(23000);
        vehicleTwo.setPurchaseDate(new Date(112, 11, 3));
        vehicleTwo.setVehicleModelId(new VehicleModel(2));
        vehicleModelTwo.setVehicleModelName("Corolla");


        System.out.println(vehicleTwo.getVehicleId());
        System.out.println(vehicleTwo.getYear());
        System.out.println(vehicleTwo.getLicensePlate());
        System.out.println(vehicleTwo.getVIN());
        System.out.println(vehicleTwo.getColor());
        System.out.println(vehicleTwo.getIsPurchase());
        System.out.println(vehicleTwo.getPurchasePrice());
        System.out.println(vehicleTwo.getPurchaseDate());
        System.out.println(vehicleModelTwo.getVehicleModelName());

        }

    private static void LessonComplexProperties(){

        EntityType emailWorkType = new EntityType("Work");
        emailWorkType.setEntityTypeId(1);

        Email myEmail = new Email("bipin.bip.com");
        myEmail.setEmailType(emailWorkType);

        System.out.println(myEmail.getEmailAddress() + " Type: " + myEmail.getEmailType().getEntityTypeName());

        Employee myEmployee = new Employee();
        myEmployee.getEmails().add(new Email("test@test.com"));
        myEmployee.getEmails().add(new Email("dan@test.com"));
        myEmployee.getEmails().add(new Email("jason@test.com"));

        for(Email email : myEmployee.getEmails()){
            System.out.println(email.getEmailAddress());
        }
    }

    private static void LessonCollections(){
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Dan", "Simmer");
        Employee emp2 = new Employee("James", "McRoberts");
        Employee emp3 = new Employee("Sean", "Nilsen");
        Employee emp4 = new Employee("Adrian", "Ratanyake");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        employeeList.add(new Employee("Adrian", "Ratanyake"));
        employeeList.add(new Employee("John","Doe"));

        System.out.println(employeeList.get(0).getFullName());

        for(Employee e : employeeList){
            System.out.println(e.getFullName());
        }


    }

    private static void LessonObjectsLAB(){
        Address addressOne = new Address(1);
        System.out.println(addressOne.getAddressId());

        Client clientOne = new Client(1);
        System.out.println(clientOne.getClientId());

        ClientContact clientContactOne = new ClientContact(1);
        System.out.println(clientContactOne.getClientContactId());

        Email emailOne = new Email("filler email");
        System.out.println(emailOne.getEmailId());

        Employee employeeOne = new Employee("Eric", "Bye");
        System.out.println(employeeOne.getEmployeeId());

        EmployeeProject employeeProjectOne = new EmployeeProject(1);
        System.out.println(employeeProjectOne.getEmployeeProjectId());

        Entity entityOne = new Entity(1);
        System.out.println(entityOne.getEntityId());

        EntityType entityTypeOne = new EntityType(1);
        System.out.println(entityTypeOne.getEntityTypeId());

        LoyaltyAccount loyaltyAccountOne = new LoyaltyAccount(1);
        System.out.println(loyaltyAccountOne.getLoyaltyAccountId());

        LoyaltyCompany loyaltyCompanyOne = new LoyaltyCompany(1);
        System.out.println(loyaltyCompanyOne.getLoyaltyCompanyId());

        LoyaltyCompanyType loyaltyCompanyTypeOne = new LoyaltyCompanyType(1);
        System.out.println(loyaltyCompanyTypeOne.getLoyaltyCompanyTypeId());

        Person personOne = new Person();
        System.out.println(personOne.getPersonId());

        Phone phoneOne = new Phone(1);
        System.out.println(phoneOne.getPhoneId());

        Project projectOne = new Project(1);
        System.out.println(projectOne.getProjectId());

        ProjectStatus projectStatusOne = new ProjectStatus(1);
        System.out.println(projectStatusOne.getProjectStatusId());

        Review reviewOne = new Review(1);
        System.out.println(reviewOne.getReviewId());

        ReviewData reviewDataOne = new ReviewData(1);
        System.out.println(reviewDataOne.getReviewDataId());

        Training trainingOne = new Training(1);
        System.out.println(trainingOne.getTrainingId());

        TrainingData trainingDataOne = new TrainingData(1);
        System.out.println(trainingDataOne.getTrainingDataId());

        Vehicle vehicleOne = new Vehicle(1);
        System.out.println(vehicleOne.getVehicleId());

        VehicleMake vehicleMakeOne = new VehicleMake(1);
        System.out.println(vehicleMakeOne.getVehicleMakeId());

        VehicleModel vehicleModelOne = new VehicleModel(1);
        System.out.println(vehicleModelOne.getVehicleModelId());

        VehicleStatus vehicleStatusOne = new VehicleStatus(1);
        System.out.println(vehicleStatusOne.getVehicleStatusId());

    }

    private static void LessonMethods(){
        /*
            <access modifier> <instance/static> <return data type> <method name> (<data type <param name>, <data type> <param name>, ...) { body }
            private             static              void            LessonMethods   (nothing)

            public                                  int             getPersonId     (nothing)

            public                                  void            setPersonId     (int personId)
         */
        /*Employee constructorEmployee = new Employee("Bipin", "Butala");
        System.out.println(constructorEmployee.getFirstName() + " " + constructorEmployee.getLastName());

        Employee const2Employee = new Employee("Simmer");
        System.out.println(const2Employee.getLastName());*/

        Employee employeeJames = new Employee("James","McRoberts");
        System.out.println(employeeJames.getFullName());

    }

    private static void LessonInheritance() {

        Employee employeeBip = new Employee();
        employeeBip.setFirstName("Bipin(e)");
        employeeBip.setLastName("Butala(e)");
        employeeBip.setId(3);

        System.out.println(employeeBip.getId() + ": " + employeeBip.getFirstName() + " " + employeeBip.getLastName());

        Person personBip = new Person();
        personBip.setFirstName("Bipin(p)");
        personBip.setLastName("Butala(p)");
        personBip.setId(2);

        System.out.println(personBip.getId() + ": " + personBip.getFirstName() + " " + personBip.getLastName());

    }

    private static void LessonClassObjects() {
        Person myFirstPerson = new Person();
        myFirstPerson.setFirstName("Bipin");
        myFirstPerson.setLastName("Butala");
        myFirstPerson.setTitle("Mr.");

        Person mySecondPerson = new Person();
        mySecondPerson.setFirstName("Sarah");
        mySecondPerson.setLastName("Butala");
        mySecondPerson.setTitle("Mrs.");

        System.out.print(myFirstPerson.getTitle());
        System.out.print(" ");
        System.out.print(myFirstPerson.getFirstName());
        System.out.print(" ");
        System.out.println(myFirstPerson.getLastName());

        System.out.print(mySecondPerson.getTitle());
        System.out.print(" ");
        System.out.print(mySecondPerson.getFirstName());
        System.out.print(" ");
        System.out.println(mySecondPerson.getLastName());

        myFirstPerson.setId(3);
        System.out.print(myFirstPerson.getId());
    }

    private static void ThrownExceptionLAB() throws Exception{
        String[] myStringArray = new String[4];
        try{myStringArray[0] = "first";
            myStringArray[1] = "second";
            myStringArray[2] = "third";
            myStringArray[3] = "fourth";
            myStringArray[4] = "fifth";
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            throw new Exception("Array is not large enough to store that many items.", ex);
        }
    }

    private static void LessonCalculatorLAB(){
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0;
        while (true) {
            System.out.print("Enter a number 0-9: ");
            String inputOne = reader.nextLine();
            firstNumber = Integer.parseInt(inputOne);
        if (firstNumber >= 10){
            System.out.println("INVALID");
        }
        else
            break;
        }
        int secondNumber  = 0;
        while (true) {
            System.out.print("Enter a second number 0-9: ");
            String inputTwo = reader.nextLine();
            secondNumber = Integer.parseInt(inputTwo);
        if (secondNumber >= 10){
            System.out.println("INVALID");
        }
        else
            break;
        }
        String inputOperator = null;
        while (true) {
            System.out.print("Enter an Operator(+,-,/,*): ");
            inputOperator = reader.nextLine();
        if (!"+".equals(inputOperator) && !"-".equals(inputOperator) && !"/".equals(inputOperator) && !"*".equals(inputOperator)) {
            System.out.println("INVALID");
        }
        else
            break;
        }
        switch (inputOperator)
        {
            case "+":
                int plusResult = (firstNumber + secondNumber);
                System.out.println("Result = " + plusResult);
                break;
            case "-":
                int minusResult = (firstNumber - secondNumber);
                System.out.println("Result = " + minusResult);
                break;
            case "/":
                int divideResult = (firstNumber / secondNumber);
                System.out.println("Result = " + divideResult + " Remainder: " + firstNumber % secondNumber);
                break;
            case "*":
                int multiplyResult = (firstNumber * secondNumber);
                System.out.println("Result = " + multiplyResult);
                break;
        }

    }

    private static void LessonFizzBuzzLAB(){
        for(int x = 0; x <= 100; x++){
            if(x % 3 ==0 && x % 5 !=0){
                System.out.println("Fizz");
            }
            else if(x % 5 ==0 && x % 3 !=0){
                System.out.println("Buzz");
            }
            else if(x % 15 ==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(x);
            }
        }
    }

    private static void LessonExceptions(){
    /*
        String firstName = "Eric";
        int x = Integer.parseInt(firstName);

        System.out.print("Integer value: ");
        System.out.println(x);



        String firstName = "Eric";
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        } catch(NumberFormatException ex) {
            System.out.println("Exception: Invalid Number");
        }


        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Exception: String was null or empty");
        }
        catch (NullPointerException ex)
        {
            System.out.println("Exception: Null Pointer");
        }
        catch (Exception ex)
        {
            System.out.println("Generic Exception");
        }

        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Exception: String was null or empty");
        }
        catch (NullPointerException ex)
        {
            System.out.println("Exception: Null Pointer");
        }
        catch (Exception ex)
        {
            System.out.println("Generic Exception");
        }
        finally
        {
            System.out.println("Program has been completed regardless of exceptions");
        }

        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Exception: " + ex.toString());
        }
        catch (NullPointerException ex)
        {
            System.out.println("Exception: " + ex.toString());
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex.toString());
        }
        finally
        {
            System.out.println("Program has been completed regardless of exceptions");
        }


        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        }
        catch (Exception ex)
        {
            throw new Exception("A custom exception from LessonExceptions method.", ex);
        }
    */
    }

    private static void LessonFlowControl(){
        String name = "ericb";
        if(name.equals( "dan")) {
            System.out.println("correct first name");
            System.out.println("another line");
        } else {
            System.out.println("incorrect first name");

            if(name.length() > 10) {
                System.out.println("very long first name");
            } else if(name.length() > 5) {
                System.out.println("long first name");
            } else {
                System.out.println("short first name");
            }

        }

        switch(name) {
            case "eric":
                System.out.println("cool first name");
                break;
            case "dan":
            case "danny":
            case "daniel":
                System.out.println("first name is dan, danny, or daniel");
                break;

            default:
                System.out.println("some other first name");
                break;
        }
    }

    private static void LessonOperators(){
        int val = 10;
        System.out.println(val + 10);
        System.out.println(val - 10);

        int modVal = 10 % 3; //Only gives remainder
        System.out.println(modVal);

        System.out.println("increment after: ");
        System.out.println(val++);
        System.out.println(val++);
        System.out.println(val++);
        System.out.println(val);

        val =10;
        System.out.println("increment before: ");
        System.out.println(++val);
        System.out.println(++val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println("decrement after: ");
        System.out.println(val--);
        System.out.println(val--);
        System.out.println(val--);
        System.out.println(val);

        val = 10;
        System.out.println("decrement before: ");
        System.out.println(--val);
        System.out.println(--val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        int anotherVal = 10;

        if (val != anotherVal)
            System.out.println("Not Equals");
        else
            System.out.println("Equals");

        if(val ==10 && anotherVal == 10 || val == 11)
            System.out.println("is true");
        else
            System.out.println("not true");

        boolean boolVar = true;
        if(!boolVar)
            System.out.println("is true");
        else
            System.out.println("not true");

    }

    private static void LessonFundamentalsLAB(){
        // Number 2: Accepts input and adds 1.75
        System.out.println("Question Number 2: ");
        int userInput = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a value from 1-10: ");
        String input = reader.nextLine();
        int intFromInput = Integer.parseInt(input);
        double result = intFromInput + 1.75;
        System.out.println(result);

        //Number 3: Eight data types
        System.out.println("");
        System.out.println("Question Number 3: ");
        byte varByte = Byte.MAX_VALUE;
        short varShort = Short.MAX_VALUE;
        int varInt = Integer.MAX_VALUE;
        long varLong = Long.MAX_VALUE;
        float varFloat = Float.MAX_VALUE;
        double varDouble = Double.MAX_VALUE;
        boolean varBoolean = false;
        char varChar = Character.MAX_VALUE;

        System.out.println("Byte: Default[0]  Min[" + Byte.MIN_VALUE + "]  Max[" + varByte +"]");
        System.out.println("Short: Default[0]  Min[" + Short.MIN_VALUE + "]  Max[" + varShort +"]");
        System.out.println("Integer: Default[0]  Min[" + Integer.MIN_VALUE + "]  Max[" + varInt +"]");
        System.out.println("Long: Default[0]  Min[" + Long.MIN_VALUE + "]  Max[" + varLong +"]");
        System.out.println("Float: Default[0]  Min[" + Float.MIN_VALUE + "]  Max[" + varFloat +"]");
        System.out.println("Double: Default[0]  Min[" + Double.MIN_VALUE + "]  Max[" + varDouble +"]");
        System.out.println("Boolean: Default[" + varBoolean + "]");
        System.out.println("Character: Default[u0000]  Min[" + Character.MIN_VALUE + "]  Max[" + varChar +"]");

        //Number 4: Strings are Arrays
        System.out.println("");
        System.out.println("Question Number 4: ");
        String arrayString = "This is a string";
        System.out.println(arrayString);
        // Strings store characters individually in an indexed array.
        // We can pull individual characters from this sample string with the index value
        // The index is zero based, so the first index value will be 0,
        // and will grab the first character in the string

        int indexOf = arrayString.indexOf("T");
        System.out.println("Index of T: " + indexOf);

        int lastIndexOf = arrayString.lastIndexOf("i");
        System.out.println("Last Index of i: " + lastIndexOf);

        //Number 5: You can only create lists from Reference Types, not primitive types
        System.out.println("");
        System.out.println("Question Number 5: ");
        List<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(11);
        myIntList.add(22);
        myIntList.add(33);
        myIntList.add(44);
        myIntList.add(55);

        System.out.println(myIntList);

        for(int oneInt : myIntList){
            System.out.println(oneInt);
        }

        //Number 6: Lottery Information
        System.out.println("");
        System.out.println("Question Number 6: ");
        String gameName = "Powerball";
        List<Integer> winningNumbers = new ArrayList<Integer>();
        winningNumbers.add(3);
        winningNumbers.add(6);
        winningNumbers.add(12);
        winningNumbers.add(32);
        winningNumbers.add(64);
        winningNumbers.add(19);
        int jackpot = 150000000;
        Date drawingDate = new Date(119, 11, 15);

        System.out.println("Game Name: " + gameName);
        System.out.println("Winning Numbers: " + winningNumbers);
        System.out.println("Jackpot: " + jackpot);
        System.out.println("Drawing Date: " + drawingDate);

    }

    private static void LessonLists(){
        List<String> myStringCollection = new ArrayList<String>();

        myStringCollection.add("1st string");
        myStringCollection.add("2nd string");
        myStringCollection.add("3rd string");
        myStringCollection.add("4th string");
        myStringCollection.add("5th string");

        System.out.println(myStringCollection);

        for(String singleString : myStringCollection){
            System.out.println(singleString);
        }
        List<Integer> myIntCollection = new ArrayList<Integer>();

        myIntCollection.add(10);
        myIntCollection.add(20);
        myIntCollection.add(30);
        myIntCollection.add(40);
        myIntCollection.add(50);

        System.out.println(myIntCollection);

        for(int singleInt : myIntCollection) {
            System.out.println(singleInt);
        }

        String[] myStringArray = new String[5];

        myStringArray[0] = "1st";
        myStringArray[1] = "2nd";
        myStringArray[2] = "3rd";
        myStringArray[3] = "4th";
        myStringArray[4] = "5th";

        System.out.println(myStringArray);

        for(String singleString : myStringArray){
            System.out.println(singleString);
        }


    }

    private static void LessonStrings(){

        String firstString = "";
        firstString = null;

        if (firstString == null || firstString.isEmpty())  {
            System.out.println("String is empty");

        } else {
            System.out.println("String has a value");
        }

        firstString = "another value";

        for(int x = 0; x <= 100; x++){
            firstString = "new value " + Integer.toString(x);
            System.out.println(firstString);
        }

        StringBuilder myStringBuilder = new StringBuilder();

        for(int x = 0; x <= 100; x++){
            myStringBuilder.append("new value with string builder: ") ;
            myStringBuilder.append(Integer.toString(x));
            myStringBuilder.append("\n");
        }
        System.out.println(myStringBuilder);

        String myName = "Eric Bye";

        int indexOf = myName.indexOf("i");
        System.out.println(indexOf);
        int lastIndexOf = myName.lastIndexOf("e");
        System.out.println(lastIndexOf);

        String largeString = "This is a longer string than before";
        for(char c : largeString.toCharArray()){
            System.out.println(c);
        }
        String partOfLargerString = largeString.substring(8, 16);
        System.out.println(partOfLargerString);
    }

    private static void LessonDataTypes(){
        boolean myBool = false;
        int myInt = 4;
        String myString = "some words";
        Date myDate = new Date();

        System.out.println(myBool);
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDate);


        String numberString = "341";
        int intFromString = Integer.parseInt(numberString);
        System.out.println(intFromString);

        int i = 312;
        String stringFromInt = Integer.toString(i);

        System.out.println(stringFromInt);

        String stringFromDate = myDate.toString();

        System.out.println(stringFromDate);
    }

    private static void LessonVariables(){


        String lastName = "Butala", firstName = "Bipin";

        System.out.println(firstName + " " + lastName);

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String input = reader.nextLine();

        System.out.println("Hello " + input);
    }
}
