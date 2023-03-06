import java.text.DecimalFormat;
import java.util.Scanner;

import javax.crypto.spec.DESKeySpec;

public class convertCurrency {
    public static void main(String[] args){
        int choice;
        double amount;
        double rupee, dollar, euro;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose the currency: ");
        System.out.println("Enter 1 for Rupee");
        System.out.println("Enter 2 for Dollar");
        System.out.println("Enter 3 for Euro");
        choice = sc.nextInt();

        System.out.println("Enter the amount: ");
        amount = sc.nextFloat();

        switch(choice)
        {
            case 1:
                dollar = amount/81.71;
                System.out.println(amount+" Rupee= "+f.format(dollar)+ " Dollar");

                euro = amount/87.03;
                System.out.println(amount+" Rupee= "+f.format(euro)+ " Euro");

                break;

            case 2:
                rupee = amount*81.71;
                System.out.println(amount+" Dollar= "+f.format(rupee)+ " Rupee");

                euro = amount*0.94;
                System.out.println(amount+" Dollar= "+f.format(euro)+ " Euro");

                break;

            case 3:
                rupee = amount*87.03;
                System.out.println(amount+" Euro= "+f.format(rupee)+ " Rupee");

                dollar = amount*1.07;
                System.out.println(amount+" Euro= "+f.format(dollar)+ " Dollar");
                
                break;


        }

    }
    
}
