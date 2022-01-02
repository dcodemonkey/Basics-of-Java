package com.basicofjava;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Conditional Statements - Java
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("You're not adult.");
        // }
        // Program to Check whether the Given Number is Odd/Even
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if (number % 2 == 0) {
        // System.out.println("Given Number is Even number.");
        // } else {
        // System.out.println("Given Number is Odd number.");
        // }

        // Program to Check whether the Given number is Greater or Lower or Equal
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b) {
        // System.out.println("Equal");
        // }
        // else {
        // if (a > b) {
        // System.out.println("A is Greater than B");
        // } else {
        // System.out.println("A is Small than B");
        // }
        // }

        // Optimized Code for the same as above
        // if(a == b) {
        // System.out.println("Equal");
        // } else if(a > b) {
        // System.out.println("A is Greater than B");
        // }
        // else {
        // System.out.println("A is Small than B");
        // }

        // switch statetment

        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button == 1) {
        // System.out.println("Hello");
        // } else if(button == 2) {
        // System.out.println("Namaste");
        // } else if(button == 3) {
        // System.out.println("Bonjour");
        // }
        // else {
        // System.out.println("Invalid Button.");
        // }

        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;

        //     default:
        //         System.out.println("Invalid Button");
        //         break;
        // }

        // Create a Calculator using the switch case statement

        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int button = sc.nextInt();

        // switch (button) {
        //     case 1:
        //         System.out.println(num1+num2);
        //         break;
        //     case 2:
        //         System.out.println(num1-num2);
        //         break;
        //     case 3:
        //         System.out.println(num1*num2);
        //         break;
        //     case 4:
        //         System.out.println(num1%num2);
        //         break;
        
        //     default:
        //     System.out.println("Please select the valid input betweeen 1 to 4 to perform some operation..");
        //         break;
        // }

        // Ask the user to enter the number of the month & print the name of the month. 
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        
            default:
                System.out.println("Please enter valid input to get the Months name between 1 to 12...!");
                break;
        }
    }
}
