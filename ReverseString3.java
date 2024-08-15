
public class ReverseString3 {
    public static void main(String[] args) {
        String name = "Bikash";
        String revName = "";
        int nameLenth = name.length();
        for (int i = nameLenth - 1; i >= 0; i--) {
            revName = revName + name.charAt(i);
        }
        System.out.println(revName);

        StringBuffer sf = new StringBuffer(name); // 2nd method
        System.out.println(sf.reverse());
    }

}
