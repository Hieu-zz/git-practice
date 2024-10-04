package RestaurantManagement.utils;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void WriteToFileUsingOutputStream(FileOutputStream file, String content) throws IOException {
        file.write(content.getBytes());
        file.flush();
    }
}
