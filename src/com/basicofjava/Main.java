package com.basicofjava;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // for loop in Java
    // for(int counter = 1; counter <= 5; counter++) {
    // System.out.println("Hello Java");
    // }

    // for(int counter = 0; counter <= 10; counter++) {
    // System.out.println(counter);
    // }

    // while loop in java
    // int counter = 0;
    // while(counter <=10) {
    // System.out.println(counter);
    // counter++;
    // }

    // do while loop in Java
    // int counter = 0;
    // do {
    // System.out.println(counter);
    // counter++;
    // } while(counter <= 10);

    // Print the Sum of First n Natural Numbers.
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // int sum = 0;
    // for(int i = 0; i<=num; i++) {
    // sum = i+sum;
    // }
    // System.out.println(sum);

    // Print the table of a number input by the user.
    // Scanner sc= new Scanner(System.in);
    // int num = sc.nextInt();

    // for(int i = 1; i<=10; i++){
    // System.out.println(num * i);
    // }
    // Print all even numbers till n
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // for(int i = 1; i <= num; i++){
    // if(i % 2 == 0) {
    // System.out.println(i);
    // }
    // }

    /*
     * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
     * If the user enters 1 then keep taking input from the user
     * for a student’s marks(out of 100).
     * If they enter 0 then stop.
     * If he / she scores :
     * Marks >= 90 -> print “This is Good”
     * 89 >= Marks >= 60 -> print “This is also Good”
     * 59 >= Marks >= 0 -> print “This is Good as well”
     * Because marks don’t matter but our effort does.
     */

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    switch (num) {
      case 0:
        System.out.println("Thanks..");
        break;
      case 1:
        do {
          Scanner in = new Scanner(System.in);
          int marks = in.nextInt();
          if (marks >= 90) {
            System.out.println("This is Good.");
          } else if (marks <= 89 && marks >= 60) {
            System.out.println("This is also good");
          }
        } while (num == 1);
        break;
      default:
        System.out.println("Please enter the number the number between 0 and 1");
    }
  }

}
