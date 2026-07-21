/* 
    Find the Output.
*/
public class Q2 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}