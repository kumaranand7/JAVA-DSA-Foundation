package pw;
public class Pw1_LastOccuranceOfNum {
    public static void main(String[] args) {
        int arr[]={3,4,5,3,4,5,4};
        for (int i= arr.length-1; i>=0; i--)
        {
           if(arr[i]==5)
           {
               System.out.println(i);
               break;
           }
        }

    }
}
