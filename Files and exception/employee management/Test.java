import java.io.*;
import java.util.Scanner;

public class Test{
    public static Scanner sc;

    public static File CreateFileObject(String emp_id){
        String fileName = "files" + File.separator + emp_id + ".txt";
        File e = new File(fileName);
        return e;
    }

    public static void createFile(String name, String emp_id,String salary, String dept, String email){
        try{
            File e = CreateFileObject(emp_id);
            if(e.createNewFile()){
                FileWriter myWriter = new FileWriter(e);
                myWriter.write(emp_id+" "+name+" "+salary+" "+dept+" "+email+"\n");
                myWriter.close();
                System.out.println("Record created: "+e.getName());
            }
            else{
                System.out.println("Record already exists");
            }
        }
        catch(IOException ex){
            System.out.println("Error occured: Couldn't create record");
        }

    }

    public static void readFile(String emp_id){
        try{
            File e = CreateFileObject(emp_id);
            if(e.exists()){
                Scanner myReader = new Scanner(e);
                while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            }
            
        }catch(FileNotFoundException e){
            System.out.println("This employee record doesnot exists");
        }

    }

    public static void deleteById(String emp_id){
        File e = CreateFileObject(emp_id);
        if (e.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }

    public static void updateFile(String emp_id, String oldString, String newString){
        try{
            String oldContent = "";

            String fileName = "files" + File.separator + emp_id + ".txt";

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            FileWriter writer = new FileWriter(fileName);
            writer.write(newContent);
            reader.close();
            writer.close();

            System.out.println("Updated Successfully");

        }catch(IOException ex){
            System.out.println("Error occured while updating! ");
        }
    }


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Employee Management System");
        System.out.println("====================================");
        System.out.println("1. Create a new employee record");
        System.out.println("2. Read an employee record");
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

                createFile(name, emp_id,salary,dept,mobile);
            }

            else if(option.equals("2")){
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();

                readFile(emp_id);
                
            }


            else if(option.equals("3")){
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();
                System.out.print("Enter the old detail: ");
                String oldString = sc.next();
                System.out.print("Enter the new detail: ");
                String newString = sc.next();
                updateFile(emp_id,oldString,newString);
            }

            else{
                System.out.print("Enter the employee id:");
                String emp_id = sc.next();

                deleteById(emp_id);
                
             }
            
        }
        sc.close();
        System.out.println("Program exited successfully");
    }
}
