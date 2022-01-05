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

  public static void calculateFactorial(int n) {
    // loop
    int factorial = 1;

    for(int i=n; i>=1; i--){
      factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
  }

  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   calculateFactorial(n);

  //  int sum  = calculateSum(a, b);
  //  System.out.println("Sum of 2 numbers is: " + sum);

  //  System.out.println("Sum of 2 numbers is: " + calculateProduct(a,b));


  }
  
}
