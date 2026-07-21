/* 
    Write a Java program to replace space with underscores.
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your line :");
        String line = sc.nextLine();

        String newline = line.replace(" ", "_");
        System.out.println("The Modified Line is : " + newline);

        sc.close();
    }
}
