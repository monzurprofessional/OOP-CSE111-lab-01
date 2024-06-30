// TASK 5
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 different numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("Largest number: "+ a);
            }
            else{
                System.out.println("Largest number: "+ c);
            }

        }
        else{
            if(b>c){
                System.out.println("Largest number: "+ b);
            }
            else {
                System.out.println("Largest number: "+ c);
            }
        }

    }
}
