package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadUtil {
    public List<Character> readFile(File inputFile) throws IOException {
        List<Character> output = new ArrayList<>();
        int ch;
        try (FileInputStream fileInputStream = new FileInputStream("D:\\test.txt")) {
            while ((ch = fileInputStream.read()) != -1) {
                output.add((char) (ch));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return output;
    }
    public List<Character> readFile1(File inputFile) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(inputFile);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        List<Character> output=new ArrayList<>();
        try{
            int c;
            while((c=bufferedInputStream.read())!=-1){
                output.add((char)c);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        bufferedInputStream.close();
        return output;
    }
    public List<Character> readFile3(File inputFile) throws IOException{

        FileReader intput_file=new FileReader("D:\\test.txt");
        List<Character> output=new ArrayList<>();
        try{
            int c;
            while((c= intput_file.read())!=-1){
//                output_file.write(c);
                output.add((char)c);
            }
            intput_file.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return output;
    }
    public String readFile4(File inputFile) throws IOException {

        FileReader intput_file=new FileReader(inputFile);
        BufferedReader bufferedReader=new BufferedReader(intput_file);
        String content=bufferedReader.readLine();
        try{
            bufferedReader.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return content;
    }

//        FileOutputStream fileOutputStream=new FileOutputStream("D:\\output.txt");


//        try{
//            int c;
//            while((c=bufferedInputStream.read())!=-1){
//                bufferedOutputStream.write((char)c);
//            }
//            bufferedInputStream.close();

//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }



}
