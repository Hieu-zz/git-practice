package IOPractice.utils;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void WriteToFileUsingOutputStream(FileOutputStream file, String content) throws IOException {
        file.write(content.getBytes());
        file.flush();
    }

    public static void WriteToFileUsingBufferedOutputStream(BufferedOutputStream file, String content)
            throws IOException {
        file.write(content.getBytes());
        file.flush();
    }

    public static void WriteToFileUsingFileWriter(BufferedWriter bufferedWriter, String content) throws IOException {
        for (int i = 0; i < content.length(); i++) {
            bufferedWriter.write(content.charAt(i));
        }
    }

    public static void WriteToFileUsingBufferedWriter(BufferedWriter file, String content) throws IOException {
        for (int i = 0; i < content.length(); i++) {
            file.write(content.charAt(i));
        }
    }
}
