package pw;

public class pw_19_binarySort {

    public static int binarysearch(int arr[],int key){


        int se=0;
        int ee=arr.length-1;



        while (se<=ee){

            int mid = se+(ee-se)/2;

            if (key<arr[mid])
            {
                ee=mid-1;


            }
            else if (key>arr[mid]){

                se=mid+1;

            }
            else if (key==arr[mid])
            {

                return mid;

            }



        }

        return -1;




    }


    public static void main(String[] args) {
        int arr[]={1,32,54,56,77,88,90};
        int key=88;

        int index=binarysearch(arr,key);
        System.out.println("element "+key+" is at index "+index);





    }
}
