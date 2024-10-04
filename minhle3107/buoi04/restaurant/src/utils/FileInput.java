package utils;

import java.io.*;

public class FileInput {

    private final String pathFile = System.getProperty("user.dir") + "/data/input/test.txt";

    public FileInput() {
    }

    public String getPathFile() {
        return pathFile;
    }

    public String bufferedReader() {
        StringBuilder result = new StringBuilder();
        try (FileReader fr = new FileReader(getPathFile());
             BufferedReader br = new BufferedReader(fr)) {
            int i;
            while ((i = br.read()) != -1) {
                result.append((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result.toString();
    }
}