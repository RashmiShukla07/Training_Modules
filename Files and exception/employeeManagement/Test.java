package employeeManagement;
import java.util.Scanner;

public class Test{
    public static Scanner sc;
    public static void main(String[] args){
        FileOperations f = new FileOperations();
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Employee Management System");
        System.out.println("====================================");
        System.out.println("1. Create a new employee record");
        System.out.println("2. Search an employee record");
        System.out.println("3. Update an existing employee record");
        System.out.println("4. Delete an existing record");
        System.out.println("5. Quit Program\n");

        while(true){
            System.out.print("Select the operation:");
            String option = sc.next();

            if(option.equals("5")){
                break;
            }

            if(option.equals("1")){
                System.out.print("Enter the name of employee: ");
                String name = sc.next();
                System.out.print("Enter their employee id: ");
                String emp_id = sc.next();
                System.out.print("Enter their salary: ");
                String salary = sc.next();
                System.out.print("Enter their department: ");
                String dept = sc.next();
                System.out.print("Enter their email: ");
                String mobile = sc.next();

                f.createFile(name, emp_id,salary,dept,mobile);
            }

            else if(option.equals("2")){
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();

                f.readFile(emp_id);
                
            }


            else if(option.equals("3")){
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();
                f.readFile(emp_id);
                System.out.print("Enter the old detail: ");
                String oldString = sc.next();
                System.out.print("Enter the new detail: ");
                String newString = sc.next();

                f.updateFile(emp_id,oldString,newString);
            }

            else{
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();

                f.deleteById(emp_id);
                
             }
            
            System.out.println("\n");
            
        }
        sc.close();
        System.out.println("Program exited successfully");
    }

    
}
