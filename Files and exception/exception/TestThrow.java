//throw keyword used to explicitly throw an exception

public class TestThrow {
    public static void main(String[] args){
        try{
            throw new ArithmeticException();
        }
        catch(ArithmeticException ex){
            ex.printStackTrace();
        }
    }
}
