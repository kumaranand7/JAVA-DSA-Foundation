package pw;

import java.util.Scanner;

public class PW12_InsertionSort {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of element  ");
        int n=sc.nextInt();

        System.out.println("enter the "  +n+ " element in the array: ");

//        int arr[]={12,33,44,3,67,7};

        int arr[]=new int [n];
        for (int i=0;i< arr.length ; i++){

            arr[i]=sc.nextInt();
        }


//        int i;
//        int temp;

        System.out.println("sorted array is :");
        for ( int i=1; i< arr.length; i++)
        {
            int j=i-1;
            int  temp= arr[i];
            while ( j>=0 && arr[j]>temp){

                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;

        }

        for (int element :arr){
            System.out.print(element+" ");
        }


    }


}



