/* 
    Write a java Program to encrypt a grade by adding 8 to it. Decrypt it to show the correct  grade.
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        char encrypt = (char) (grade + 8);
        System.out.println("Encrypted Grade = " + encrypt);

        char decrypt = (char) (encrypt - 8);
        System.out.println("Decrypted Grade = " + decrypt);

        sc.close();
    }
}
