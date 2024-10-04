import util.ReadUtil;
import util.WriteUtil;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadUtil readUtil=new ReadUtil();
        WriteUtil writeUtil=new WriteUtil();
        File inputFile=new File("D:\\test.txt");
        File outputFile=new File("D:\\output.txt");
        try{
            if(!inputFile.exists()){
                inputFile.createNewFile();
                FileWriter writer=new FileWriter(inputFile);
                writer.write("Việt Dương");
                writer.close();
            }
            if(!outputFile.exists()){
                outputFile.createNewFile();
            }
            writeUtil.writeFile1(outputFile,readUtil.readFile1(inputFile));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}