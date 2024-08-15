public class StarPattern42 {
    public static void main(String[] args) {
        // starTrianglePatern(5);
        reverseStarTriangle(5);

    }

    public static void starTrianglePatern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseStarTriangle(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
