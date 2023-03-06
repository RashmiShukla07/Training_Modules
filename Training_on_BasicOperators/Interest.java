import java.util.Scanner;

class Interest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        double Principal = sc.nextDouble();
        System.out.println("Enter the rate");
        double rate = sc.nextDouble();
        System.out.println("Enter the time");
        double time = sc.nextDouble();

        double SI = Principal*(rate/100)*time;
        double CI = (Principal*Math.pow((1+(rate/100)),time)) - Principal;

        System.out.println("The simple interest for Principal: "+Principal+" Rate: "+rate+" Time: "+time+"= "+SI);
        System.out.println("The compound interest for Principal: "+Principal+" Rate: "+rate+" Time: "+time+"= "+CI);

        
    }
}
