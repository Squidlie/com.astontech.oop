package com.astontech;

import sun.awt.X11.XSystemTrayPeer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LessonLists();

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
