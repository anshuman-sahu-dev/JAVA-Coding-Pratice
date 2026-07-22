/* 
    Write a Java program to check whether a string is a palindrome.
*/

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your String : ");
    String word = sc.nextLine();

    String reverse = "";

    for(int i = word.length() - 1; i >= 0; i--){
        char ch = word.charAt(i);
        reverse = reverse + ch;
    }

    if (word.equals(reverse)) {
        System.out.println(word + " is a palindrome.");
    }
    else{
        System.out.println(word + " is not a palindrome.");
    }

    sc.close();
}
    
}