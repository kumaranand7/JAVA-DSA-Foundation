package pw;

import java.util.Scanner;

public class pw_16_halfsum_sumarray {

//partition the array into two parts if sum of both sub array are equal then return true else return false



//    eg:     5,3,2,6,3,1 {5+3+2}={6+3+1}

    public static int total_Sum(int arr[])
    {
        int tsum=0;
        for (int i=0; i< arr.length; i++)
        {
            tsum=tsum+arr[i];
        }
        return tsum;
    }



public static boolean havesubarray(int[] arr)
{
    int tsum= total_Sum(arr);
    int prefix_sum=arr[0];
      for (int i=0; i< arr.length-1; i++){

          if (prefix_sum==tsum-prefix_sum) {
              return true;
          }
          else {
              prefix_sum  +=  arr[i+1];
          }






      }
    return false;

}


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements in the array:" );
        int n= sc.nextInt();;

        int arr[]=new int[n];
        System.out.print("Enter " +n+ " elements in the array:" );

         for (int i=0;i<n; i++ ){

             arr[i]=sc.nextInt();

         }


//       boolean ans=havesubarray(arr);
        System.out.println(havesubarray(arr));

    }

}
