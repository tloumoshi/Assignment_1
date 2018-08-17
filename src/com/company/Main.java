package com.company;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String Name;
	int Age;
	int appAge;
	String message;
	int difference;


	Scanner input = new Scanner(System.in);

	message = "Please enter your name : ";
	System.out.print(message);
	Name = input.nextLine() ;

        Calendar calenderDay = Calendar.getInstance();
        int dayOrNight = calenderDay.get(Calendar.AM_PM);
        if (dayOrNight!= 1) {
            message = "Good Morning";
            System.out.println(message);
        }
        else {
            message = "Good Afternoon";
            System.out.println(message);

        }
           message = "Please enter your Age :";
           System.out.println(message);
           Age = input.nextInt();

           Random randomGenerate = new Random();
           appAge = randomGenerate.nextInt(90-18)+18;



           if (Age < appAge) {
               difference = appAge - Age;
               System.out.println("I am " + difference + " years younger than you");
           }
           else{
               difference = appAge - Age;
               System.out.println("I am " + difference + " years older than you");

        }
	      System.out.println("Twice my age : " + appAge * 2 );
           if (appAge % 2 == 0){
               System.out.println("My age is an even number");
           }
           else{
               System.out.println("My age is an odd number");
           }
           System.exit(-1);
    }


    }
//End of Main Class
