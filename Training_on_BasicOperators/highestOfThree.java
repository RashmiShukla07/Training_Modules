import java.util.Scanner;

//Find the highest of three numbers-

public class highestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res;

        if(a>b && a>c){
            res = a;
        }
        else if(b>a && b>c){
            res = b;
        }
        else{
            res = c;
        }

        System.out.println("The highest of a= "+a+" b= "+b+" c= "+c+" is "+res);
    }
}
