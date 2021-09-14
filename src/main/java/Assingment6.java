/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 jeremiah pike
 */

import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter your age now : ");
        int numberone = input1.nextInt();

        System.out.println("Enter your retirement age: ");
        int numbertwo = input1.nextInt();

        System.out.println("Your time until retirement is: "  + (numbertwo - numberone) +" years. " + "\r\nIt is: " + year + " so you can retire in: " + ( year + (numbertwo - numberone) ));





    }
}