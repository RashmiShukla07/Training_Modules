//Generics solve issues of type-safety in older version of java 
import java.util.ArrayList;

class Demo {
    public static void main(String[] args)
    {
        // Creating a an ArrayList with String specified
        ArrayList <String> al = new ArrayList<String> ();
 
        al.add("Sachin");
        al.add("Rahul");
 
        //al.add(10); Now Compiler doesn't allow this
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
