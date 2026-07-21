public class Q3 {
    public static void main(String[] args) {
        byte b = 10;
        b += 5;       // compound assignment
        System.out.println(b);

        byte c = 10;
        c = (byte) (c + 5);    // simple assignment
        System.out.println(c);
    }
}
