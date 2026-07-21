/* 
    Write a java Program to convert a String to lowercase.
*/

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Your String : ");
        String word = Sc.nextLine();

        System.out.println("The word in lowercse : " + word.toLowerCase());
        
        Sc.close();
    }
}