package utils;

import java.io.*;

public class DocFile {

    public String docByFileInputStream() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream("E:/CY_VietNam/Buoi4_IO/test.txt");
            int c;
            while ((c = fis.read()) != -1) {
                sb.append((char) c);
            }

        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return sb.toString();
    }

    public String docByBufferedInputStream() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream("E:/CY_VietNam/Buoi4_IO/test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                sb.append((char) c);
            }
            fis.close();
            bufferedInputStream.close();

        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return sb.toString();
    }

    public String docByFileReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File("E:/CY_VietNam/Buoi4_IO/test.txt");
            FileReader fileReader = new FileReader(String.valueOf(file));
            int ch = fileReader.read();
            while (ch != -1) {
                sb.append((char) ch);
                ch = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return sb.toString();
    }

    public String docByBufferedReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File("E:/CY_VietNam/Buoi4_IO/test.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                sb.append(text);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return sb.toString();
    }
}
