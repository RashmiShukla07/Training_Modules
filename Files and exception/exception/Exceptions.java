//Custom exception
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args){
        //ArithmeticException
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        //ArrayIndexOutOfBound
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }

        try {
            // Throw an object of user defined exception
            throw new MyException("Custom Exception!!!");
        }
        catch (MyException ex) {
            System.out.println("Caught Custom exception");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
    
}
