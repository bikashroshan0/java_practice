public class StringManupulation7 {
    public static void main(String[] args) {
        String str = "Hello_my_name_is_bikash";
        String[] splitedStr = str.split("_");
        for (String str1 : splitedStr) {
            System.out.println(str1);
        }
    }
}
