// TASK 2
public class task2 {
    public static void main(String[] args) {
        //by creating a third variable
        int a = 5;
        int b = 10;
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //without creating any other variables
        int x = 5;
        int y = 10;
        x = x + y; //15
        y = x-y; //15-10=5
        x= x-y; //15-5=10
        System.out.println(x);
        System.out.println(y);

    }
}
