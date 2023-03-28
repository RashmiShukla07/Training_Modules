import java.util.*;

public class Set_q2 {
    public static void main(String[] args){
        Set<Integer> hashset = new HashSet<Integer>();
        int[] arr = {1,2,3,1,2,3,3,3,3};
        for(int i =0 ; i<arr.length; i++ ){
            hashset.add(arr[i]);
        }
        System.out.println(hashset);
    }
    
}
