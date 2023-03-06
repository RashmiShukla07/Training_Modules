class Divide{
    public int divideTwoNumbers(int a, int b){
        return a/b;
    }
}
public class divideNumbers {
    public static void main(String a[]){
        int a1 = 4;
        int a2 = 2;

        Divide obj = new Divide();
        int result = obj.divideTwoNumbers(a1, a2);
        System.out.print(result);


    }
}
