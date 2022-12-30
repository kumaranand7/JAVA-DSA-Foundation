package pw;
import java.util.Arrays;
public class pw3_SmallestAndLargest {
    public static void main(String[] args) {
       int []arr= {12,34,5,4,44,444};
         Arrays.sort(arr);
        System.out.println("Smallest element is "+arr[0]+"\n"+"largest element is "+arr[arr.length-1]);
    }
}
