import utils.FileInput;
import utils.FileOutput;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInput fileInput = new FileInput();
        FileOutput fileOutput = new FileOutput(fileInput);

//        System.out.println(fileInput.getPathFile());
        System.out.println("*******************************");
        System.out.println("Input");
//        System.out.println(fileInput.fileInputStream());
//        System.out.println(fileInput.bufferedInputStream());
//        System.out.println(fileInput.fileReader());
        System.out.println(fileInput.bufferedReader());

        System.out.println("*******************************");
        System.out.println("Output");
//        fileOutput.fileOutputStream();
//        fileOutput.bufferedOutputStream();
//        fileOutput.bufferedWriter();
        fileOutput.fileWriter();

    }
}