import java.util.Arrays;
import java.util.List;

//It is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound: <? super A>. 

public class lowerBound {
    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        printOnlyIntegerClassorSuperClass(list1);
 
        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);
        printOnlyIntegerClassorSuperClass(list2);
    }
 
    public static void printOnlyIntegerClassorSuperClass(
        //This method will only take Integer or its superclass objects
        List<? super Integer> list)
    {
        System.out.println(list);
    }
    
}
