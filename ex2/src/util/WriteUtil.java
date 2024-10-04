package util;

import java.io.*;
import java.util.List;

public class WriteUtil {
    public void writeFile(File outputFile, List<Character> a){
        try(FileOutputStream fileOutputStream=new FileOutputStream(outputFile,true)){
            for(char c:a){
                fileOutputStream.write(c);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void writeFile1(File outputFile,List<Character> a) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(outputFile,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        try{

            for(char c:a){
                fileOutputStream.write(c);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        bufferedOutputStream.close();
    }
    public void writeFile3(File outputFile,List<Character>a) throws IOException {
        FileWriter output_file = new FileWriter(outputFile);
        for(char c:a){
            output_file.write(c);
        }
        output_file.close();
    }
    public void writeFile4(File outputFile,String a) throws IOException {
        FileWriter output_file=new FileWriter("D:\\output.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(output_file);
        try{
            bufferedWriter.write(a);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
