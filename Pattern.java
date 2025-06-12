import java.util.Scanner;

public class Pattern {
   public static void main(String[] arg) {
      Scanner sc = new Scanner(System.in);


      // for(int i=1; i<=4; i++){
      // for(int j=1; j<=4; j++){
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for(int i=0; i<=4; i++){
      // for(int j=0; j<=i; j++){
      // System.out.print(" *");
      // }
      // System.out.println();
      // }

      // int size = 5; // You can change the size of the square
      // for (int i = 1; i <= size; i++) {
      // for (int j = 1; j <= size; j++) {
      // // Print '*' on the boundary
      // if (i == 1 || i == size || j == 1 || j == size) {
      // System.out.print("* ");
      // } else {
      // System.out.print(" "); // Print space for hollow part
      // }
      // }
      // System.out.println();
      // }

      // int num = 1;
      // for (int i = 1; i <= 5; i++) {
      //    for (int j = 1; j <= i; j++) {
      //       // Print '*' on the boundary
      //       System.out.print(num + " ");
      //       num++;
      //    }
      //    System.out.println();
      // }

   
      // for (int i = 1; i <= 4; i++) {
      //    for (int j = 1; j <= i; j++) {
      //       if((i+j) % 2 == 0){
      //          System.out.print(" 1 ");
      //       }
      //       else{
      //          System.out.print(" 0 ");
      //       }
      //    }
      //    System.out.println();
      // }

      for (int i = 5; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
            System.out.print(j);
         }
         System.out.println();
      }

        


      

   }

}
