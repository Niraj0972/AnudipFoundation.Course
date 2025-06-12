import java.util.Scanner;

public class Switchcase {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the choice");
    int choice=sc.nextInt();

    switch(choice){
        case 1 :
          System.out.println("Hello");
          break;

        case 2 :
          System.out.println("Namaste");
          break;

        case 3 :
          System.out.println("Good Morning");
          break;

        case 4 :
          System.out.println("Good Night");
          break;

        default: 
          System.out.println("Bonju");
          break;
    }
   }
}
