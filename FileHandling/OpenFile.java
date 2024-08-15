package FileHandling;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

public class OpenFile {
    public static void main(String[] args) {
        String filePath = "/Users/Narayan/Downloads/bkrResume.pdf";
        openFile(filePath);

    }

    public static void openFile(String filePath) {
        File file = new File(filePath);
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException e) {
            System.out.println("Not able to oepn the file");
            e.printStackTrace();
        }
    }
}
