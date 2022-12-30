package pw;

import static pw.Pair.pairFun;

class Pair{

     static int c=0;
     static  int pairFun(int arr[])
    {


        for(int i=0; i< arr.length; i++)
        {

            for( int j=i+1; j< arr.length; j++)
            {
                if (arr[i]+arr[j]==7)
                {
                    c++;
                }


            }
        }
       System.out.println(c);

        return 0;

    }

}
public class pw6_ArrayPairSum {
    public static void main(String[] args) {


        int arr[]={1,2,5,3,5,2,6,7};
//        Pair obj=new Pair();
        pairFun(arr);



    }


}
