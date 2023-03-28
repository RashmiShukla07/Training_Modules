import java.util.ArrayList;
import java.util.Scanner;

class Arraylist_q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("==========================");
        System.out.println("Arraylist Program");
        System.out.println("==========================");
        System.out.println("Select an operation");
        System.out.println("1.Add an element \n2.Remove an element \n3.Display elements \n4.Exit program\n");

        while(true){
            System.out.print("Choose an operation to be performed:");
            String option = sc.next();

            if(option.equals("1")){
                System.out.print("Enter an element to be inserted: ");
                String e = sc.next();
                if(!list.contains(e)){
                    list.add(e);
                }
            }
            else if(option.equals("2")){
                System.out.println(list);
                System.out.print("Enter the element to be removed: ");
                String rem = sc.next();
                if(list.contains(rem)){
                    int position = list.indexOf(rem);
                    list.remove(position);
                    System.out.println("Element removed successfully");
                }
                else{
                    System.out.println("Element doesnot exists");
                }
                
            }
            else if(option.equals("3")){
                System.out.println(list);
            }
            else{
                break;
            }
            System.out.println();
        }

        sc.close();
        
    }
}