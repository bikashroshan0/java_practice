package Serialization;

import java.io.*;

public class Serilization {

    public static void main(String[] args) {

        String filePath = "utils/example.txt";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        Employee employee = new Employee();
        employee.name = "Bikash";
        employee.age = 27;
        employee.empId = 003;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            System.out.println("Serilization happened successfully"); 

        } catch (Exception e) {
            e.printStackTrace(); // Print exception details
        } finally {

            try {
                // Close streams only if they are not null
                if (fileOutputStream != null)
                    fileOutputStream.close();
                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace(); // Print exception details if closing fails
            }
        }
    }

}
