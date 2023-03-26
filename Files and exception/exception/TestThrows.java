import java.io.IOException;

public class TestThrows {
    public static String inputString(String s) throws IOException{
        if(s=="Fail"){
            throw new IOException();
        }
        return "input successful";
    }
    public static void main(String[] args ){
        try{
            inputString("Fail");
        }
        catch(IOException e){
            System.out.println("wrong input: exception occured");
        }
        
    }
}
