// TASK 9
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter CGPA");
        double cgpa = sc.nextDouble();
        System.out.println("please enter credit");
        int credit = sc.nextInt();
        if(credit>=30){
            if(cgpa>=3.80 && cgpa<=3.89){
                System.out.println("The student is eligible for a waiver of 25 percent");
            }
            else if(cgpa>=3.90 && cgpa<=3.94){
                System.out.println("The student is eligible for a waiver of 50 percent");
            }
            else if(cgpa>=3.95 && cgpa<=3.99){
                System.out.println("The student is eligible for a waiver of 75 percent");
            }
            else if (cgpa==4.00) {
                System.out.println("The student is eligible for a waiver of 100 percent");
            }
            else {
                System.out.println("The student is not eligible for a waiver");
            }
        }
        else {
            System.out.println("The student is not eligible for a waiver");
        }

    }
}
