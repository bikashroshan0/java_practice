package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        String filePath = "utils/example.txt";
        FileInputStream fileInputStream = null;
        ObjectInputStream objectOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            objectOutputStream = new ObjectInputStream(fileInputStream);
            Employee employee2 = (Employee) objectOutputStream.readObject();
            System.out.println(employee2.name);
            System.out.println(employee2.age);
            System.out.println(employee2.empId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
