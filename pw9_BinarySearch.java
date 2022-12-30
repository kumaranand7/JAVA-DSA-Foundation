package pw;
import java.util.Scanner;
  class sorting {


    int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int  mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;

            } else if (key < arr[mid]) {
                high = mid - 1;

            } else if (key > arr[mid]) {
                low = mid + 1;

            }

        }

        return -1;
    }
}

    public class pw9_BinarySearch {

        public static void main(String[] args) {
           int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};


            sorting obj = new sorting();

              int result =  obj.binarySearch(arr, 11);
              if (result== -1)
              {
                  System.out.println("not found");

              }
              else {
                  System.out.println("element is at loacation "+result);
              }
        }
    }

