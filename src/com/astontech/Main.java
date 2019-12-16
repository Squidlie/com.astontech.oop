package com.astontech;

import sun.awt.X11.XSystemTrayPeer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LessonFundamentalsLAB();

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
