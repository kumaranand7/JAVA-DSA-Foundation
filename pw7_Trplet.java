//program to count the sum of triplet in ana array whose sum is 12
// 1+5+6=12


package pw;

public class pw7_Trplet
{
    public static void main(String[] args)
    {

        int c=0;
        int arr[]={1,4,5,6,3};

        for(int i=0; i< arr.length; i++)
        {
            for( int j=i+1; j< arr.length; j++)
            {
                for( int k=i+2; k< arr.length; k++)
                {
                    if (arr[i]+arr[j]+arr[k]==12)
                    {
                        c++;
                    }
                }
            }


        }
        System.out.println(c);

    }


}
