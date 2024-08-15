package FileHandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String path = "/Users/Narayan/Downloads/sample.pdf";
        createFile(path);
    }

    public static void createFile(String filePath) {
        File newFile = new File(filePath);
        try {
            boolean flag = newFile.createNewFile();
            if (flag == true) {
                System.out.println("File created");
            } else {
                createFileWithName(newFile);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createFileWithName(File file) {
        Scanner sc = new Scanner(System.in);
        String basePath = "/Users/Narayan/Downloads/";
        System.out.println("Enter the file name : ");
        String fileName = sc.nextLine();
        try {
            FileOutputStream newFile = new FileOutputStream(basePath + fileName, true);
            System.out.println("Enter the content in the file");
            String content = sc.nextLine();
            byte[] b = content.getBytes();
            newFile.write(b);
            newFile.close();
            System.out.println("File created with name : " + basePath + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
