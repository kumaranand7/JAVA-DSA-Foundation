package pw;


class A
{

    int fun(int arr[], int n)
    {
        for (int element:arr
             ) {
            System.out.println(element);

        }
        System.out.println("value of n is "+n);
       return -1;

    }

}

public class pw10_SoMuchConfusion {

    public static void main(String[] args) {


        int arr[]={23,23,34,4,32,35,5};
        int n=200;
        A obj= new A();
        obj.fun(arr,n);
    }
}
