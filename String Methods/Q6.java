/* 
    Write a Java program that counts:

    Total number of characters
    Number of vowels
    Number of consonants

Ignore spaces.
*/

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        name = name.replace(" ", "");
        System.out.println("Total number of characters are : " + name.length());

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Number of vowels are : " + vowels);
        System.out.println("Number of consonants are : " + consonants);

        sc.close();
    }
}