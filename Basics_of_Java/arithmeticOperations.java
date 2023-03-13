import java.util.*;

public class arithmeticOperations {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int mod(int a, int b){
        return a%b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        System.out.println("Addition= "+addition(a1, a2));
        System.out.println("Subtraction= "+subtraction(a1, a2));
        System.out.println("Multiplication= "+multiplication(a1, a2));
        System.out.println("Division= "+division(a1, a2));
        System.out.println("Remainder= "+mod(a1, a2));


    }
}
