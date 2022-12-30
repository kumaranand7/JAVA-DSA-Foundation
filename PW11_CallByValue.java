package pw;

public class PW11_CallByValue {
    static void fun(int x) {
        int a=x;
        a++;
        System.out.println("value of a inside "+a);
        x = x * 10;
        System.out.println("value inside functiin"+x);
    }

    public static void main(String[] args) {


        int a=10;
        System.out.println("before"+ a);

        fun(a);
        System.out.println("after "+ a);



    }
}
