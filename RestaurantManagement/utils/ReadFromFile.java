package RestaurantManagement.utils;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

    public static String ReadFile(FileInputStream file) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        int data;
        while ((data = file.read()) != -1) {
            fileContent.append((char) data);
        }
        return fileContent.toString();
    }
}
