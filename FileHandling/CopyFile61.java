package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;;

public class CopyFile61 {
    public static void main(String[] args) {
        String baseFilePath = "/Users/Narayan/Downloads/";
        String inputFilePath = "/Users/Narayan/Downloads/resumeBkr.pdf";
        String outPutfilePath = randomNewFileName(baseFilePath, "pdf");
        File inputFile = new File(inputFilePath);
        File outpFile = new File(outPutfilePath);
        copyFile(inputFile, outpFile);
    }

    public static String randomNewFileName(String basefilePath, String fileExtension) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timeStamp = dateFormat.format(new Date());
        return basefilePath + timeStamp + "." + fileExtension;

    }

    public static void copyFile(File originalCpoy, File newFile) {
        FileInputStream fileInPutStream = null;
        FileOutputStream fileOutputStream = null;
        int i = 0;
        List list;

        try {
            fileInPutStream = new FileInputStream(originalCpoy);
            fileOutputStream = new FileOutputStream(newFile);
            System.out.println(fileInPutStream.available());

            while ((i = fileInPutStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInPutStream != null) {
                try {
                    fileInPutStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
