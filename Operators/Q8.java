
/* 
    Use Comparison Operator to find out whether a given number is grater then the users entered number or not
*/
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int n1 = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (n1 < num) {
            System.out.println("The entered number is grater then the given number.");
        } else {
            System.out.println("The entered number is not grater then the given number.");
        }

        sc.close();
    }
}
