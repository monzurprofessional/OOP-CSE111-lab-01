// TASK 7
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("Divisible by Both");
        }
        else if (a%5==0) {
            System.out.println("Invalid: Divisible by 5 only");
        }
        else if (a%7==0) {
            System.out.println("Invalid: Divisible by 7 only");
        }
        else {
            System.out.println("No");
        }
    }
}
