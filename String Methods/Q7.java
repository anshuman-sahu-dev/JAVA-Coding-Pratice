/* 
    Write a Java program to reverse a given string without using any built-in reverse method.
*/
import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Name : ");
    String name = sc.nextLine();

    String reversString = "";

    for(int i = name.length() - 1; i >= 0; i-- ){
        reversString = reversString + name.charAt(i);
    }

    System.out.println("Original Name : " + name);
    System.out.println("ReversString Name : " + reversString);

    sc.close();
}
    
}