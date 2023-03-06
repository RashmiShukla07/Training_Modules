import java.util.Scanner;

class Average{
    public int calculateAverage(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }
}

public class averageOfNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Average ob = new Average();
        int result = ob.calculateAverage(a, b, c);

        System.out.println("The average of the given numbers= "+ result);

    }
}