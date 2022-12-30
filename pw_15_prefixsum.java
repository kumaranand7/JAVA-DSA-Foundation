package pw;
import java.util.Scanner;

/*
prefix sum

arr= [1,2,7,3,2,1];
prefixsum=[1,3,10,13,2,1]

*/
public class pw_15_prefixsum {

    public static int[] prefixsum(int[] arr, int[] psum)
    {
         int sum=0;

         for (int i=0; i< arr.length; i++)
         {

                 psum[i]=sum+arr[i];
                 sum=psum[i];

         }

        return psum;

//        psum[0]=arr[0];
//        for (int i=1; i< arr.length; i++)
//        {
//
//            psum[i]=psum[i-1]+arr[i];
//
//
//        }



    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,7,3,2,1};
        int psum[]=new int[6];


        int result[]=prefixsum(arr,psum);

        for (int element: result)
        {
            System.out.print(element+" ");

        }
    }

}
