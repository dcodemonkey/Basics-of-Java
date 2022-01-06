package com.basicofjava;

import java.util.*;

public class Arrays {
  public static void main(String args[]) {
    // int [] marks = new int[3];
    // int marks[] = new int[3];
    // int marks[] = {97, 99, 98};

    // marks[0] = 97; // Physics
    // marks[1] = 99; // Chemistry
    // marks[2] = 98; // Biology

    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);

    // for(int i=0; i<3; i++){
    //   System.out.println(marks[i]);
    // }
    
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int numbers[] = new int[size];

    // input
    // for(int i=0; i<size; i++){
    //   numbers[i] = sc.nextInt();
    // }

    // output
    // for(int i=0; i<size; i++){
    //   System.out.println(numbers[i]);
    // }

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
    // input
    for(int i=0; i<size; i++){
      numbers[i] = sc.nextInt();
    }

    int x = sc.nextInt();

    // Output
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] == x){
        System.out.println(x + " is found at index : " + i);
        break;
      }
      else {
        System.out.println(x + " is not found in the array at index: " + i);
      }
    }
  }
}
