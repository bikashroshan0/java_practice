public class MainOverLoaded {
    public static void main(String[] args) {
        System.out.println("Main method");
        main(0);
        main("Bikash");
        main(10, 12);
    }

    public static void main(String args) {
        System.out.println("Main method 1");

    }

    public static void main(int a) {
        System.out.println("Main method 2");

    }

    public static void main(int a, int b) {
        System.out.println("Main method 3");

    }
}
