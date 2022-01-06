package com.basicofjava;

import java.util.*;

public class function {

  // public static int calculateSum(int a, int b) {
  //   int sum  = a + b;
  //   return sum;
  // }

  // public static int calculateProduct(int a, int b) {
  //   return a * b;
  // }

  // public static void calculateFactorial(int n) {
  //   // loop
  //   int factorial = 1;

  //   for(int i=n; i>=1; i--){
  //     factorial = factorial * i;
  //   }
  //   System.out.println(factorial);
  //   return;
  // }

  // public static void calculatePrime(int num){
  //   boolean flag = false;
  //   for(int i=2; i<=num/2; ++i){
  //     if(num % i == 0){
  //       flag = true;
  //       break;
  //     }
  //   }

  //   if(!flag){
  //     System.out.println(num + " is a prime number.");
  //   } else {
  //     System.out.println(num + " is not a prime number.");
  //   }
  // }

  // public static void checkOddEven(int num){
  //   if(num % 2 == 0){
  //     System.out.println(num + " is a even number.");
  //   } else {
  //     System.out.println(num + " is a odd number.");
  //   }
  // }

  // Make a function to print the table of a given number n.

  public static void printTable(int num){
    for(int i=1; i<=10; i++){
      System.out.println(num + " x " + i + " = " + num*i);
    }
    return;
  }



  public static void main(String args[]) {

   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   printTable(n);

  //  checkOddEven(n);
  //  calculatePrime(n);
  //  calculateFactorial(n);

  //  int sum  = calculateSum(a, b);
  //  System.out.println("Sum of 2 numbers is: " + sum);

  //  System.out.println("Sum of 2 numbers is: " + calculateProduct(a,b));


  }
  
}
