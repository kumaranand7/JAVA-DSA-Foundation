//PROGRAM TO REVERSE AN ARRAY LIST


package pw;
import java.util.ArrayList;
import java.util.Collections;

public class pw_20_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(12);
        l1.add(33);
        l1.add(55);
        l1.add(34);
        l1.add(25);
        l1.add(77);
        l1.add(11);
        l1.add(99);

        System.out.println("ORIGINAL ARRAY IS "+l1);
        reverse (l1);
    }

    public static void reverse(ArrayList<Integer> l1)
    {

        int i=0;
        int j= l1.size()-1;

        while (i<j){

            /*
      int temp=a;
           a=b;
           b=temp;

             */

//            Integer temp= Integer.valueOf(l1.get(i));

            Integer temp=l1.get(i);
            l1.set(i,l1.get(j));
            l1.set(i,l1.get(j));
            l1.set(j,temp);

                 i++;
                 j--;

        }

        System.out.println("REVERSED ARRAY IS "+l1);
        Collections.reverse(l1);

        System.out.println("REVERSED USING COLLECTIONS IS "+l1);

        Collections.sort(l1);
        System.out.println("SORTED IN ASCENDING ORDER "+l1 );

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("SORTED IN DESCENDING ORDER "+l1 );



        ArrayList<String> l2= new ArrayList<>();

        l2.add("Shagun Jindal");
        l2.add("Mukul Deep");
        l2.add("Krishna-Weds-Akansha");
        l2.add("Hudda City");
        l2.add("Soumya Jain");
        l2.add("Zipanshu");
        l2.add("Amit CR");




        Collections.sort(l2);

        System.out.print("Ascending oreder: ");
        System.out.println(l2);


    }




}
