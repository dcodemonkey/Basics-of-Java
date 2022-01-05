package com.basicofjava;

public class PatternPractice {

  public static void main(String args[]) {
    // Print the Rectangle Patteren
    // int n = 4;
    // int m = 5;

    // for(int i=1; i<=n; i++) {
    //   for(int j=1; j<=m; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Print the Hollow Rectangle
    // int n = 4;
    // int m = 5;

    // // Outer loop
    // for(int i=1; i<=n; i++) {
    //   // inner loop 
    //   for(int j=1; j<=m; j++){
    //     // cell -> (i,j)
    //     if(i == 1 || j==1 || i==n || j==m){
    //       System.out.print("*");
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

  // Print Half Pyramid
    // int n = 4;

    // // Outer loop
    // for(int i=n; i>=1; i--) {
    //   // inner loop 
    //   for(int j=1; j<=i; j++){
    //     // cell -> (i,j)
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Inverted Half Pyramid

    // int n = 4;

    // // outer loop 
    // for(int i=1; i<=n; i++){
    //   // inner loop -> spaces print
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }

    //   // inner loop -> star print
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Half Inverted Pyramid with Numbers
    // int n = 5;

    // // outer loop
    // for(int i=1; i<=n; i++){
    //   // inner loop
    //   for(int j=1; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // Inverted Half Pyramid

    // int n = 5;

    // outer loop
    // for(int i=n; i>=1; i--){
    //   // inner loop
    //   for(int j=1; j<=i; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }
    // Another method to do 
    // for(int i=1; i<=n; i++){
    //   // inner loop
    //   for(int j=1; j<=n-i+1; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // Print Floyd's Traingle
    // int n = 5;
    // int number = 1;

    // // outer loop
    // for(int i = 1; i<=n; i++){
    //   // inner loop
    //   for(int j=1; j<=i; j++){
    //     System.out.print(number + " ");
    //     number++;
    //   }
    //   System.out.println();
    // }

    // Print 0-1 Triangle
    // int n = 5;

    // // outer loop
    // for(int i=1; i<=n; i++){
    //   // inner loop
    //   for(int j=1; j<=i; j++){
    //     int sum = i+j;
    //     if(sum % 2 == 0){
    //       System.out.print("1");
    //     } else{
    //       System.out.print("0");
    //     }
    //   }
    //   System.out.println();
    // }
      
    // Print butterfly Pattern
    // int n = 8;

    // // Upper Half
    // for(int i=1; i<=n; i++){
    //   // 1st Part
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }

    //   // Spaces
    //   int spaces = 2*(n-i);
    //   for(int j=1; j<=spaces;j++){
    //     System.out.print(" ");
    //   }

    //   // 2nd Part
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // // Lower Half
    // for(int i=n; i>=1; i--){
    //   // 1st Part
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }

    //   // Spaces
    //   int spaces = 2*(n-i);
    //   for(int j=1; j<=spaces;j++){
    //     System.out.print(" ");
    //   }

    //   // 2nd Part
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // Print Solid Rhombus

    // int n = 5;

    // for(int i=1; i<=n; i++){
    //   // spaces
    //   int spaces = n-i;
    //   for(int j=1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    //   // starts
    //   for(int j=1; j<=n; j++){
    //     System.out.print("*");
    //   }
    // System.out.println();
    // }

    // Print Number Pyramid

    // int n = 5;

    // // Outer loop
    // for(int i=1; i<=n; i++){
    //   // spaces
    //   int spaces = n-i;
    //   for(int j=1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    //   // numbers
    //   for(int j=1; j<=i; j++){
    //     System.out.print(i + " ");
    //   }
    //   System.out.println();
    // }

    // int n = 5;

    // // outer loop
    // for(int i=1; i<=n; i++){
    //   int spaces = n-i;
    //   for(int j=1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    //   // 1st half numbers 
    //   for(int j=i; j>=1; j--){
    //     System.out.print(j);
    //   }
    //   // 2nd half numbers 
    //   for(int j=2; j<=i; j++){
    //     System.out.print(j);
    //   }
    // System.out.println();
    // }

    int n = 5;

    // Upper Half
    for(int i=1; i<=n; i++){
      // spaces
      int spaces = n-i;
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }
      // Print the stars
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    // Lower Half
    for(int i=n; i>=1; i--){
      // spaces
      int spaces = n-i;
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }
      // Print the stars
      for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  
}
