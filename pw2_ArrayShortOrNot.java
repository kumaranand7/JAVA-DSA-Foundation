package pw;

public class pw2_ArrayShortOrNot

{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,55,65};

       for(int i=1; i<arr.length; i++)
       {

            if (arr[i]<arr[i-1]){

                System.out.println("not shoted");

            }

        }
    }
}
