/* 
    Write a Java Program to calculate percentage of a given Student in CBSE Board Exam. His marks from 5 Subjects must be taken as input from the Keyboard.
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark1 : ");
        float mark1 = sc.nextFloat();

        System.out.print("Enter Mark2 : ");
        float mark2 = sc.nextFloat();

        System.out.print("Enter Mark3 : ");
        float mark3 = sc.nextFloat();

        System.out.print("Enter Mark4 : ");
        float mark4 = sc.nextFloat();

        System.out.print("Enter mark5 : ");
        float mark5 = sc.nextFloat();

        float totalMark = mark1 + mark2 + mark3 + mark4 + mark5;
        float percentage = ( totalMark * 100 ) / 500;
        System.out.println("Total Mark = " + totalMark);
        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}
