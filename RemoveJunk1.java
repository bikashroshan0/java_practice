public class RemoveJunk1 {

    public static void main(String[] args) {
        String junkString = "3621041^^&#@* Bikash &*@*(&9++)";
        // Using regular expresion
        String cleanString = junkString.replaceAll("[^a-zA-Z0-9]", "");
        String junkString2 = junkString.replaceAll("[a-zA-Z0-9]", "");
        String witoutSpace = junkString.replaceAll("[\\s]", junkString);
        System.out.println("Clean String is " + cleanString);
        System.out.println("Junk String is " + junkString2);
        System.out.println("Without space is " + witoutSpace);
    }
}
