package com.basicofjava;

public class Patterns {
  public static void main(String args[]) {
    // Print the Pattern
    // int n = 4;
    // int m = 5;
    // // Outer Loop
    // for (int i = 1; i <= n; i++) {
    // // Inner Loop
    //   for (int j = 1; j <= m; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.print("\n");
    // }

    // Print the Hollow Rectangle 
    // int n = 4;
    // int m = 5;

    // outer loop
    // for(int i = 1; i<=n; i++) {
    //   // inner loop
    //   for(int j = 1; j<=m; j++){
    //     // cell -> (i,j)
    //     if(i == 1 || j == 1 || i == n || j == m){
    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

    // Another Pattern
    // int n = 4;

    // // Outer Loop
    // for(int i = 1; i<=n; i++){
    //   // inner loop 
    //   for(int j = 1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // // Another Pattern Inverted Pyramid 
    // int n = 4;

    // // Outer Loop
    // for(int i = n; i>=1; i--){
    //   // inner loop 
    //   for(int j = 1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Another Pattern Inverted Half Pyramid (rotated by 180deg)
    // int n = 4;

    // // Outer Loop
    // for(int i = 1; i<=n; i++){
    //   // inner loop -> space print
    //   for(int j = 1; j <=n-i; j++) {
    //     System.out.print(" ");
    //   }

    //   // inner loop -> star
    //   for(int j= 1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Another Pattern of Halff Pyramid of Number

    // int n = 5;

    // // Outer Loop
    // for(int i = 1; i<=n; i++){
    //   // inner loop
    //   for(int j = 1; j<=i; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // Another Pattern of Halff Pyramid of Number

    // int n = 5;

    // // Outer Loop
    // for(int i = n; i>=1; i--){
    //   // inner loop
    //   for(int j = 1; j<=i; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // Floyd's Triangle 

    // int n = 5;
    // int number = 1;

    // for(int i = 1; i<=n; i++){
    //   // inner loop
    //   for(int j=1; j<=i; j++){
    //     System.out.print(number + " ");
    //     number++;
    //   }
    //   System.out.println();
    // }

    int n = 5;

    // outer loop
    for(int i=1; i<=n; i++) {
      // inner Loop
      for(int j=1; j<=i; j++){
        int sum = i+j;
        if(sum % 2 == 0){
          System.out.print(1);
        } else {
          System.out.print(0);
        }
      }
      System.out.println();
    }
  }
}
