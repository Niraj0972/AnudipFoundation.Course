import java.util.Scanner;
class IfElse{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter the number : ");
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.println(a+ " is greater");
        // }
        // else{
        //     System.out.println(a+ " is smaller");
        // }

        // System.out.println("Enter the number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter the number : ");
        // int b = sc.nextInt();
        // System.out.println("Enter the number : ");
        // int c = sc.nextInt();
        // if(a>b && a>c){
        //     System.out.println("A is greater");
        // }
        // else if(b>c && b>a){
        //     System.out.println("B is greater");
        // }
        // else{
        //     System.out.println("C is greater");
        // }
        System.out.println("Enter the choice:");
        int button = sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("C Good Morning");
        }
        else{
            System.out.println("Bonju");
        }
    }
}