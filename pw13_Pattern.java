package pw;

import java.util.Scanner;


public class pw13_Pattern {

    public static void main(String[] args) {


        System.out.print("enter the value of n:");
        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
        int n= 5;



        System.out.println("----------------------------------------------------------");


        /* enter the value of n:5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * * */

        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                System.out.print("* ");

            }
            System.out.print("\n");
        }


        System.out.println("----------------------------------------------------------");



//* * * * *
//*       *
//*       *
//*       *
//* * * * *


        for (int row=1; row<=n; row++)
        {
            for (int col=1; col<=n; col++)
            {

                 if (row==1 || col==1|| row==n || col==n )  // or not &&
                 {
                     System.out.print("* ");
                 }
                 else
                 {
                     System.out.print("  ");
                 }

            }
            System.out.print("\n");
        }

        System.out.println("----------------------------------------------------------");


//*
//* *
//* * *
//* * * *
//* * * * *
        for (int i=1; i<=n; i++) // row
        {
            for (int j=1; j<=i; j++) // column
            {

                System.out.print("* ");

            }
            System.out.print("\n");
        }

        System.out.println("----------------------------------------------------------");








// logic 1
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int i=1; i<=n; i++)
        {
            for (int j=n; j>=i; j--)
            {

                System.out.print("* ");

            }
            System.out.print("\n");
        }

        System.out.println("----------------------------------------------------------");



//        Logic 2
//* * * * *
//* * * *
//* * *
//* *
//*

        for (int i=1; i<=n; i++)
        {
            for (int j=i; j<=n; j++)
            {

                System.out.print("* ");

            }
            System.out.print("\n");
        }

        System.out.println("----------------------------------------------------------");











        //logic 3

//* * * * *
//* * * *
//* * *
//* *
//*
        for (int i=1; i<=n; i++) // row
        {
            for (int j=1; j<=n-i+1; j++) // column
            {

                System.out.print("* ");

            }
            System.out.print("\n");
        }

        System.out.println("-------------------------Locic 2---------------------------------");






//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int row =1; row <=2*n-1; row++)
        {
            int coll= row>n?2*n-row:row;

            for (int col=1; col<=coll; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("----------------------------------------------------------");







//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        for (int row =1; row <=2*n-1; row++)
        {
            int coll= row>n?2*n-row:row;
            int spaces= row<=n?n-row:n-coll;  //spaces=n-col;


            for (int s=1; s<=spaces ; s++)
            {
                System.out.print(" ");
            }

            for (int col=1; col<=coll; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }



        System.out.println("----------------------------------------------------------");












//        1
//        2 1 2
//        3 2 1 2 3
//        4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5
        for (int row =1; row <=n; row++)
        {

            for (int spaces=1; spaces<=n-row; spaces++)
            {
                System.out.print("  ");
            }

            for (int col=row; col>=1; col--)
            {
                System.out.print(col+" ");
            }

            for (int col=2; col<=row; col++)
            {
                System.out.print(col+" ");
            }

            System.out.println();
        }



        System.out.println("----------------------------------------------------------");


//
//           1
//          1 2 1
//         1 2 3 1 2
//        1 2 3 4 1 2 3
//        1 2 3 1 2
//        1 2 1
//          1





for (int row=1; row<=2*n-1; row++)
{

    int colinrows=row<=n?row:2*n-row;
    int spaces=n-colinrows;
    int colinrows2=row<=n?row-1:2*n-row-1;

    for(int s=1; s<=spaces; s++)
    {
        System.out.print("  ");
    }
    for (int col=1; col<=colinrows; col++)
    {
        System.out.print(col+" ");
    }

    for (int col=1; col<=colinrows2; col++)
    {
        System.out.print(col+" ");
    }



    System.out.print("\n");

}

        System.out.println(  "--------------------------------------------------------");





//* * * * *
//*     *
//*   *
//* *
//*
        for(int row=1; row<=n; row++)
{

    for (int col=1; col<=n-row+1; col++)
    {

        if (row==1 || col==1|| row+col==n+1)
        {
            System.out.print("* ");
        }
            else
            {
            System.out.print("  ");
        }
    }
    System.out.println();
}


        System.out.println(  "--------------------------------------------------------");


//        1 2 3 4 5 * 5 4 3 2 1
//        1 2 3 4 * * * 4 3 2 1
//        1 2 3 * * * * * 3 2 1
//        1 2 * * * * * * * 2 1
//        1 * * * * * * * * * 1

        for (int row=1; row<=n; row++) {


            for (int col = 1; col <= n - row + 1; col++)

            {
                System.out.print(col+" ");
            }

            for (int col = 1; col <= 2*row-1; col++)

            {
                System.out.print("* ");
            }

            for (int col =  n - row + 1; col >=1; col--)

            {
                System.out.print(col+" ");

            }

            System.out.println();
        }


        System.out.println("----------------------------------------------------------");

    }
}
