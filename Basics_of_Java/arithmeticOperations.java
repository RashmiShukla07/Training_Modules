import java.util.*;

class Operations{
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
    public int mod(int a, int b){
        return a%b;
    }
}

public class arithmeticOperations {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        Operations ob = new Operations();
        System.out.println("Addition= "+ob.addition(a1, a2));
        System.out.println("Subtraction= "+ob.subtraction(a1, a2));
        System.out.println("Multiplication= "+ob.multiplication(a1, a2));
        System.out.println("Division= "+ob.division(a1, a2));
        System.out.println("Remainder= "+ob.mod(a1, a2));


    }
}
