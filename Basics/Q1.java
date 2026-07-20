/*
    Write a Java Program to calculate the Sum of three numbers.
 */
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your 1st number : ");
    int num1 = sc.nextInt();
    System.out.println("Enter your 2nd number : ");
    int num2 = sc.nextInt();
    System.out.println("Enter your 3rd number : ");
    int num3 = sc.nextInt();

    int sum = num1 + num2 + num3;
    System.out.println("Sum of the numbers are : " + sum);

    sc.close();
}   
}