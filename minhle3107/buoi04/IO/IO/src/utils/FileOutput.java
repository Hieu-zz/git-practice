package utils;

import java.io.*;

public class FileOutput {

    private final String pathFileOut = System.getProperty("user.dir") + "/data/output/output.txt";


    private FileInput fileInput;

    public FileOutput() {
    }

    public FileOutput(FileInput fileInput) {
        this.fileInput = fileInput;
    }

    public String getPathFileOut() {
        return pathFileOut;
    }

    public void fileOutputStream() {
        String data = fileInput.bufferedReader();
        try (FileOutputStream fileOutputStream = new FileOutputStream(getPathFileOut())) {
            byte[] bs = data.getBytes();
            fileOutputStream.write(bs);
            fileOutputStream.flush();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedOutputStream() {
        String data = fileInput.bufferedReader();

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(getPathFileOut());
                BufferedOutputStream bout = new BufferedOutputStream(fileOutputStream)
        ) {
            byte[] b = data.getBytes();
            bout.write(b);
            bout.flush();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bufferedWriter() {
        String data = fileInput.bufferedReader();

        try (BufferedWriter bout = new BufferedWriter(new FileWriter(getPathFileOut()))) {
            bout.write(data);
            bout.flush();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWriter() {
        String data = fileInput.bufferedReader();

        try (FileWriter fileWriter = new FileWriter(getPathFileOut())) {
            fileWriter.write(data);
            fileWriter.flush();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}