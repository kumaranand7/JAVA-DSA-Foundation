package pw;

public class pw4_ChechSortedArray {
    public static void main(String[] args) {

        int arr[]={12,3,55,66,77,88};
        boolean result =true;


        for (int i=1; i< arr.length; i++)
        {


            if (arr[i]<arr[i-1])
            {
                result=false;

            }


        }
        System.out.println(result);

    }
}
