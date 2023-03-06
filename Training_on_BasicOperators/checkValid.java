import java.util.Scanner;
import java.util.regex.*;

public class checkValid {
    public static boolean isValidPin(String pinCode){
        //format- 443 122
        String regex = "^[1-9]{1}[0-9]{2}\\s{1}[0-9]{3}$";

        Pattern p = Pattern.compile(regex);

        if(pinCode==null){
            return false;
        }

        Matcher m = p.matcher(pinCode);

        return m.matches();
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin num: ");
        String pin = sc.nextLine();

        System.out.println("The entered pincode is valid: "+isValidPin(pin));
        
    }
    
}
