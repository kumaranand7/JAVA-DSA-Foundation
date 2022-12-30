package pw;
import java.util.Arrays;
import java.util.Scanner;
public class pw5_ArraySortedOrNot {

    public static void main(String[] args) {
         int i;
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        System.out.print("enter array elements: ");
        for ( i=0; i<5; i++){
           arr[i]= sc.nextInt();
        }
        System.out.println("original elements are:");
        for ( i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        System.out.println("sorted arrays are:");
        Arrays.sort(arr);
        for ( i=0; i<5; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("using for each:");
        for (int element:arr) {
            System.out.println(element);
        }
    }
}
