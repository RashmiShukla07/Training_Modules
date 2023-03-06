class Add{
    public int addTwoNumbers(int a, int b){
        return a+b;
    }
}

public class addNumbers{
    public static void main(String args[]){
        int a = 8;
        int b = 9;

        Add obj = new Add();
        int result = obj.addTwoNumbers(a,b);
        System.out.println(result);

    }
}