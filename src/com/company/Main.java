package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Random;

public class Main {
    private static int randomCal()
    {
        int min = 18;
        int max = 90;
        // int age = (int)(Math.random()*min)+max;
        Random generate = new Random();
        return generate.nextInt(max-min) + min;
    }

    private static String OddEven(int num)
    {
        if(num%2 == 0)
            return "even";
        else
            return"odd";
    }
    public static void main(String[] args) throws IOException {
        System.out.println("************ Asignment 1 ************");
        System.out.print("What is your name? ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String name = br.readLine();
        int age;
        LocalTime localtime = LocalTime.now();

        if(localtime.compareTo(LocalTime.NOON)< 0)
        {
            System.out.println("Good morning " + name);
        }
        else
        {
            System.out.println("Good afternoon " + name);
        }

        System.out.print("Please enter your age? ");
        age = Integer.parseInt(br.readLine());

        int myAge = randomCal();
        int diff;

        System.out.print("I am "+ myAge + " years old, which is ");

        if(myAge > age){
            diff = myAge - age;
            System.out.println("which is "+diff+ " years older than you.");
        }else {
            diff = age - myAge;
            System.out.println("which is "+diff+ " years younger than you.");
        }
        System.out.println("Twice my age would be " + myAge*2);
        System.out.println("My age is an "+ OddEven(myAge) +" number");
        System.out.println("************ Asignment 1 done:) ************");
    }
}
