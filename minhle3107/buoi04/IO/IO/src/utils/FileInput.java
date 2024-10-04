package utils;

import java.io.*;

public class FileInput {

    private final String pathFile = System.getProperty("user.dir") + "/data/input/test.txt";

    public FileInput() {
    }

    public String getPathFile() {
        return pathFile;
    }

    public String fileInputStream() {
        StringBuilder result = new StringBuilder();
        try (FileInputStream doc = new FileInputStream(getPathFile())) {
            int data;
            while ((data = doc.read()) != -1) {
                result.append((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }

    public String bufferedInputStream() {
        StringBuilder result = new StringBuilder();
        try (FileInputStream fin = new FileInputStream(getPathFile());
             BufferedInputStream bin = new BufferedInputStream(fin)) {
            int i;
            while ((i = bin.read()) != -1) {
                result.append((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result.toString();
    }

    public String fileReader() {
        StringBuilder result = new StringBuilder();
        try (FileReader fr = new FileReader(getPathFile())) {
            int i;
            while ((i = fr.read()) != -1) {
                result.append((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result.toString();
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