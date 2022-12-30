package pw;

public class pw_14_TwopointersArray {

    public static void main(String[] args) {


        //arrange zeros and one in ascending order without soting

        int counterzero = 0;
        int counterone = 0;

        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0};


        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == 0) {
                counterzero++;
            } else {
                counterone++;

            }

        }

        for (int i = 0; i < counterzero; i++) {


            arr[i] = 0;

        }

        for (int i = counterzero; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
