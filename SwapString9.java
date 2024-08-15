public class SwapString9 {
    public static void main(String[] args) {

        // Using third variable.

        // String a = "Bikash ";
        // String b = "Roshan ";
        // String c;

        // System.out.println("Before swapping");
        // System.out.println(a + b);

        // a = b;
        // c = b;
        // a = c;
        // System.out.println("After swapping");
        // System.out.println(a + b);

        // Without using third variable.
        String x = "Aksah";
        String y = "Ranjan";
        System.out.println("Before swapping");
        System.out.println(x);
        System.out.println(y);

        x = x + y;
        y = x.substring(0, (x.length() - y.length()));
        x = x.substring(y.length(), x.length());
        System.out.println("After swapping");
        System.out.println(x);
        System.out.println(y);

    }
}
