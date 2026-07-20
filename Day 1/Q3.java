/* 
    Write a java Program to calculate CGPA using marks of three Subjects.
                Formula = cgpa = percentage / 9.5f.
*/
import java.util.Scanner;;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark of Sub1: ");
        float mark1 = sc.nextFloat();
        System.out.println("Enter mark of Sub2: ");
        float mark2 = sc.nextFloat();
        System.out.println("Enter mark of Sub3: ");
        float mark3 = sc.nextFloat();

        float totalMark = mark1 + mark2 + mark3;
        float percentage = (totalMark * 100) / 300;
        float cgpa = percentage / 9.5f;

        System.out.println("Total Mark = " + totalMark);
        System.out.println("percentage = " + percentage);
        System.out.println("CGPA = " + cgpa);

        sc.close();
    }
}
