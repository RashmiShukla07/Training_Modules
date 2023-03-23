
import java.util.Arrays;
import java.util.List;
 
class LowerBound {
    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        printOnlyIntegerClassorSuperClass(list1);
 
        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        printOnlyIntegerClassorSuperClass(list2);
    }
 
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) //this method only takes integer and it superclass
    {
        System.out.println(list);
    }
}