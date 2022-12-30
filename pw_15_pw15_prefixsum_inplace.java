package pw;

import java.util.Scanner;

public class pw_15_pw15_prefixsum_inplace {

    public static int[] prefixsum(int[] arr)
    {

        for (int i=1; i< arr.length; i++)

        {
            arr[i]+=arr[i-1];   // equal to     arr[i]=arr[i-1]+arr[i];

        }

        return arr;




    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,7,3,2,1};



        int result[]=prefixsum(arr);

        for (int element: arr)
        {
            System.out.print(element+" ");

        }
    }

}
