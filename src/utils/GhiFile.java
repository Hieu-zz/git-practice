package utils;

import java.io.*;

public class GhiFile {
    DocFile docFile = new DocFile();

    public void ghiByFileOutputStream() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("E:/CY_VietNam/Buoi4_IO/outPut.txt");
            String input = docFile.docByFileInputStream();
            byte[] bytes = input.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("ghi thanh cong");

        } catch (Exception e) {
            System.out.println("Co loi xay ra khi ghi file: " + e.getMessage());
        }

    }

    public void ghiByBufferOutputStream() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("E:/CY_VietNam/Buoi4_IO/outPut.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String input = docFile.docByBufferedInputStream();
            byte[] bytes = input.getBytes();
            bos.write(bytes);
            bos.close();
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
            System.out.println("Co loi xay ra khi ghi file: " + e.getMessage());
        }
    }

    public void ghiByFileWriter() throws IOException {
        try {
            File file = new File("E:/CY_VietNam/Buoi4_IO/outPut.txt");
            FileWriter fileWriter = new FileWriter(file);
            String input = docFile.docByFileReader();
            fileWriter.write(input);
            fileWriter.close();
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
            System.out.println("Co loi xay ra khi ghi file: " + e.getMessage());
        }
    }

    public void ghiByBufferWriter() throws IOException {
        try {
            File file = new File("E:/CY_VietNam/Buoi4_IO/outPut.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String input = docFile.docByBufferedReader();
            bufferedWriter.write(input);
            bufferedWriter.close();
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
            System.out.println("Co loi xay ra khi ghi file: " + e.getMessage());
        }

    }
}
