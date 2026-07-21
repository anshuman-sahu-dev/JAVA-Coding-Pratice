/* 
    Predict the output, and state the compile-time data type of result:
*/

public class Q5 {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.5;
        var result = (a > 3) ? a : b;
        System.out.println(result);
    }
}
