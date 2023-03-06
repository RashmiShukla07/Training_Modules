import java.util.Scanner;

class Product{
    public int multiplyTwoNumbers(int a, int b){
        return a*b;
    }
}

public class productNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int a2 = sc.nextInt();

        Product obj = new Product();
        int result = obj.multiplyTwoNumbers(a1, a2);

        System.out.println(result);

    }
}
