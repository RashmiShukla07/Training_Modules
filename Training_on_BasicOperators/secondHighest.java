import java.util.Scanner;
public class secondHighest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i= 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>highest){
                second_highest = highest;
                highest = arr[i];
            }
        }
        
        System.out.println("The second highest number in the arr is "+second_highest);

    }
}
