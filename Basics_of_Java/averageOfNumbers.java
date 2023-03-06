import java.util.Scanner;

public class averageOfNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum/3;

        System.out.println("The average of the given numbers= "+ avg);

    }
}