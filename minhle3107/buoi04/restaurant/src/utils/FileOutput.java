package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
}