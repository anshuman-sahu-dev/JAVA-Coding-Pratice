/* 
    Write a program to format the following letter using escap sequence Characters.
            letter = " Dear Anshuman, This Java Course is nice. Thanks!"
*/

/* public class Q5 {
    public static void main(String[] args) {
        System.out.println("Dear Anshuman,\nThis Java Course is nice.\nThanks!");
    }
} */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Course : ");
        String course = sc.nextLine();

        System.out.print("Enter Closing Message : ");
        String message = sc.nextLine();

        System.out.println("Dear, " + name);
        System.out.println("\tThis " + course + " is nice.");
        System.out.println(message);

        sc.close();
    }
}