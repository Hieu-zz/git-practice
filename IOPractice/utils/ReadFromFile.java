package IOPractice.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static String getTextString(FileInputStream file) throws IOException {
        String content = new String(file.readAllBytes());
        return content;
    }

    public static void ReadFileUsingFileInputStream(FileInputStream file) throws IOException {
        int data;
        while ((data = file.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
    }

    public static void ReadFileUsingBufferedInputStream(BufferedInputStream file)
            throws IOException {
        int data;
        while ((data = file.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
    }

    public static void ReadFileUsingFileReader(FileReader file) throws IOException {
        char ch[] = new char[500];
        file.read(ch);
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void ReadFileUsingBufferedReader(BufferedReader file) throws IOException {
        if (file.ready()) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
