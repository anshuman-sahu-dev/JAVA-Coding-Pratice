/* 
    Write a java Program to convert kilometers to miles.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometers : ");
        float km = sc.nextFloat();

        float miles = km * 0.62f;
        System.out.println("Miles = " + miles);

        sc.close();
    }
}
