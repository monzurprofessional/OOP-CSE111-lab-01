// TASK 10
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
      int n = sc.nextInt();
      if(n%2==0 && n%5==0){
          System.out.println("Multiple of 2 and 5 both");
      }
      else if (n%2==0 || n%5==0) {
          System.out.println(n);
      }
      else {
          System.out.println("Not a multiple we want");

      }
    }
}
