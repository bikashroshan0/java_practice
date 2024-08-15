public class CountCase {

    public static void main(String[] args) {
        String str = "Welcome to the Bandhu Enclave";
        countCase(str);
    }

    public static void countCase(String str) {
        String updatedStr = str.replaceAll("\\s+", "");
        StringBuffer upperCaseSF = new StringBuffer();
        StringBuffer lowerCaseSF = new StringBuffer();

        int uppparCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < updatedStr.length(); i++) {
            char ch = updatedStr.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppparCaseCount++;
                upperCaseSF.append(ch);
            } else {
                lowerCaseCount++;
                lowerCaseSF.append(ch);
            }
        }
        System.out.println("Upper case string : " + upperCaseSF.toString());
        System.out.println("Lower case string : " + lowerCaseSF.toString());
        System.out.println("TOtal number of lower case : " + lowerCaseCount);
        System.out.println("TOtal number of upper case : " + uppparCaseCount);

    }

}
