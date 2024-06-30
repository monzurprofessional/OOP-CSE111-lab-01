// TASK 8
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student ID");
        int id = sc.nextInt();
        id/=100000;
         int sem = id%10;
         int year = id/10;

        if(sem==1){
            System.out.println("Student joined BRAC in Spring "+ year);
        }
        else if(sem==2){
            System.out.println("Student joined BRAC in Fall "+ year);
        }
        else if(sem==3){
            System.out.println("Student joined BRAC in Summer "+ year);
        }

    }
}
