public class CountCharInString48 {
    public static void main(String[] args) {
        // countCharInString("biksdahi", 'i');
        countChar("sbdfsiebsif", 's');
        countCharWithoutCoveringIntoChar("sbdfsiebsif", 's');

    }

    public static void countCharInString(String str, char ch) {
        int count = 0;
        for (char ch1 : str.toCharArray()) {
            if (ch1 == ch) {
                count++;
            }
        }
        System.out.println(ch + " :: " + count);
    }

    public static void countCharWithoutCoveringIntoChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (ch == str.charAt(i)) {
                count = count + 1;
            }

        }
        System.out.println("Total number of " + ch + " in " + str + " is :: " + count);

    }

    public static void countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(ch + " :: " + count);
    }
}
