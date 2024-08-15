package FileHandling;

import java.io.File;
import java.util.Arrays;

public class FileList {
    public static void main(String[] args) {
        String folderPath = "/Users/Narayan/Desktop/mNm";
        getFileAndFolder(folderPath);

    }

    public static void getFileAndFolder(String filePath) {
        File file = new File(filePath);
        File files[] = file.listFiles();
        Arrays.sort(files);

        for (File f : files) {
            if (f.isFile()) {
                System.out.println("File : " + f.getName() + ", " + f.getAbsolutePath());
            } else if (f.isDirectory()) {
                System.out.println("Folder : " + f.getName());
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
