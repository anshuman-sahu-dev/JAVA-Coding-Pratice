/* 
    Write a java Program Which Asks the user to enter his/her name and greats them with "Hello <name>, have a good day" text.
*/

import java.util.Scanner;
public class Q4 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your Name : ");
    String name = sc.nextLine();

    System.out.println("Hello, " + name + " Have a Good Day!");

    sc.close();
}
    
}
