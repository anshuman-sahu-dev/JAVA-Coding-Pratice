/* 
    Write a java Program to detect double and tripple Space in a String.
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line : ");
        String line = sc.nextLine();

        if (line.contains("  ")) {
            System.out.println("Double Space is found");
        }else{
            System.out.println("Double Space not found");
        }

        if (line.contains("   ")) {
            System.out.println("Tripple Space is found");
        }else{
            System.out.println("Tripple Space not found");
        }
        sc.close();
    }
}
