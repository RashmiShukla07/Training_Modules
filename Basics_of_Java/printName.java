import java.util.*;

public class printName {
    public static void main(String a[]){
        String name;
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Enter your name: ");
            name  = sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("ERROR!!! \nENTER A STRING :");
            name  = sc.nextLine();
        }
        

        System.out.println("Hello");
        System.out.println(name);

    }
}
