// TASK 1
import java.util.Scanner;
public class task1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        //A
        int num1;
        num1 = 5;
        System.out.println(num1);

        //B
        int num2 = 4;
        num2+=num1;
        System.out.println(num2);
        num2 = 4;

        //C
        int prod = num1*num2;
        int div = num1/num2;
        System.out.println(prod);
        System.out.println(div);

        //D
          //1A:
        double num3;
        num3 = 5.4;
        System.out.println(num3);
        //1B:
        double num4 = 4.2;
        num4+=num3;
        System.out.println(num4);
        num4 = 4.2;
        //1C:
        double prod2 = num3*num4;
        double div2 = num3/num4;
        System.out.println(prod2);
        System.out.println(div2);

        //E
        //1A:
        double num5;
        num5 = 5.4;
        System.out.println(num5);
        //1B:
        int num6 = 4;
        num6+=num5;
        System.out.println(num6);
        num6 = 4;
        //1C:
        double prod3 = num5*num6;
        double div3 = num5/num6;
        System.out.println(prod3);
        System.out.println(div3);

        //F:

        String word1;
        word1 = "hello";
        System.out.println(word1);
        String word2 = "world";
        //word1+= word2;
        System.out.println(word1+word2);
        int n = 44;
        System.out.println(n+word1);
        System.out.println(word1+n);


        //G:
        int a;
        a = sc.nextInt();
        System.out.println(a);
        int b = sc.nextInt();
        System.out.println(a+b);

    }
}