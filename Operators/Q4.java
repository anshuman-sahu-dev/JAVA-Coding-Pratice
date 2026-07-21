/* 
    Predict the output:
*/

public class Q4 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        boolean result = a < b && b < c || a > c;
        System.out.println(result);

        /* 
            Precedence: && binds tighter than ||
        */
       
        int x = 5;
        boolean check = (x = 10) > 5;
        System.out.println(check + " " + x);
    }
}
