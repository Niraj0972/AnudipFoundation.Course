import java.util.Scanner;
public class ExceptionHandleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        try{
            System.out.println("Enter the 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            System.out.println(a / b);
        }
        catch(Exception e){
            System.out.println("Divide by zero error");
        }
        finally{
            System.out.println("Execution sucessfully");
        }
    }
}
