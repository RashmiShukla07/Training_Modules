import java.util.Scanner;
public class productNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int a2 = sc.nextInt();

        int result =a1*a2;

        System.out.println(result);

    }
}
