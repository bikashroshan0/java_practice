package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class ReadFile {

    public static void main(String[] args) {
        openFile("/Users/Narayan/Downloads/sample.txt");

    }

    public static void openFile(String filePath) {
        File f = new File(filePath);
        try {

            FileInputStream file = new FileInputStream(f);
            int i = 0;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
            }
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
