package IOPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import IOPractice.utils.ReadFromFile;
import IOPractice.utils.WriteToFile;

public class App {
    public static void main(String[] args) {
        // Read from file
        String content = "";
        try (FileInputStream file = new FileInputStream("IOPractice\\input.txt")) {
            content = ReadFromFile.getTextString(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // try (FileInputStream file = new FileInputStream("IOPractice\\input.txt")) {
        // // System.out.println("Read file using File Input Stream: ");
        // ReadFromFile.ReadFileUsingFileInputStream(file);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // try (FileInputStream file = new FileInputStream("IOPractice\\input.txt");
        // BufferedInputStream bufferedInput = new BufferedInputStream(file)) {
        // System.out.println("Read file using Buffered Input Stream: ");
        // ReadFromFile.ReadFileUsingBufferedInputStream(bufferedInput);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // try (FileReader file = new FileReader("IOPractice\\input.txt")) {
        // System.out.println("Read file using File Reader: ");
        // ReadFromFile.ReadFileUsingFileReader(file);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // try (FileReader file = new FileReader("IOPractice\\input.txt");
        // BufferedReader bufferedReader = new BufferedReader(file)) {
        // System.out.println("Read file using Buffered Reader: ");
        // ReadFromFile.ReadFileUsingBufferedReader(bufferedReader);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // Write to file
        // try (FileOutputStream file = new FileOutputStream("IOPractice\\output.txt"))
        // {
        // WriteToFile.WriteToFileUsingOutputStream(file, content);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // try (FileOutputStream file = new FileOutputStream("IOPractice\\output.txt");
        // BufferedOutputStream bufferedOutput = new BufferedOutputStream(file)) {
        // WriteToFile.WriteToFileUsingBufferedOutputStream(bufferedOutput, content);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // try (FileWriter file = new FileWriter("IOPractice\\output.txt")) {
        // WriteToFile.WriteToFileUsingFileWriter(file, content);
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        try (FileWriter file = new FileWriter("IOPractice\\output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(file)) {
            WriteToFile.WriteToFileUsingFileWriter(bufferedWriter, content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
