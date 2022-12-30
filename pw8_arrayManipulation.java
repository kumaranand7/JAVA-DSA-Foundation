//print the umique number in array

package pw;

public class pw8_arrayManipulation {


    public static void main(String[] args) {

        int arr []= {1,2,3,5,1,2,3};
        for(int i=0; i< arr.length; i++)
        {
            for (int j=i+1; j< arr.length; j++)
            {

                if (arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0; i< arr.length; i++)
        {
            if (arr[i]>=0 ){
                System.out.println(arr[i]);
            }
        }
    }
}
