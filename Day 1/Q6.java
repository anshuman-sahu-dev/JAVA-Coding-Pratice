/* 
    Write a java Program to detect whether a number entered by the user is integer or not.
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        if (sc.hasNextInt()) {
            System.out.println("The entered number is an Integer.");
        }else{
            System.out.println("The entered number is not an Integer.");
        }

        sc.close();
    }
}
