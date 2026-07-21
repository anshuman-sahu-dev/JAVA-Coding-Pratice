/* 
    Write a java Program to fill in a letter template which looks below :

        letter = "Dear <| name |>, Thanks a lot!"

    replace <| name |> with a String
*/
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = "Dear <| name |>, Thanks a lot!";

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        String modifiedLine = line.replace("<| name |>", name );
        System.out.println("The new line is : " + modifiedLine);

        sc.close();
    }
}