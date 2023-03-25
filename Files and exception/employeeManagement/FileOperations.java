package employeeManagement;
import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public File CreateFileObject(String emp_id){
        String fileName = "employeeManagement"+File.separator+ "files" + File.separator + emp_id + ".txt";
        File e = new File(fileName);
        return e;
    }

    public void createFile(String name, String emp_id,String salary, String dept, String email){
        try{
            File e = CreateFileObject(emp_id);
            if(e.createNewFile()){
                FileWriter myWriter = new FileWriter(e);
                myWriter.write("Employee-id: "+emp_id+", Name: "+name+", Salary: "+salary+", Department:  "+dept+", Email: "+email+"\n");
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

    public void readFile(String emp_id){
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

    public void deleteById(String emp_id){
        File e = CreateFileObject(emp_id);
        if (e.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }

    public void updateFile(String emp_id, String oldString, String newString){
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
    
}
