import java.util.Arrays;
import java.util.List;

//These wildcards can be used when you want to relax the restrictions on a variable.
//To declare an upper-bounded wildcard, use the wildcard character (‘?’), followed by the extends keyword, followed by its upper bound. 

class UpperBound {
    public static void main(String[] args)
    {
 
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Total sum is:" + sum(list1));
 
        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.print(String.format("Total sum is: %.2f",sum(list2)));
    }
 
    private static double sum(List<? extends Number> list)
    {
        //This means that list being passed can be of any field or subclass of that field. Here, Integer and Double are subclasses of class Number.
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
 
        return sum;
    }
}
