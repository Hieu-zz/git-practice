package ultil;

import java.io.*;

public class Main {
    public static void FileInputStream(){
        try {
            FileInputStream doc = new FileInputStream("D:\\java_cy\\ultil\\test.txt");
            FileOutputStream output = new FileOutputStream("D:\\java_cy\\ultil\\output.txt");
            int data;
            while((data = doc.read()) != -1){
                System.out.print((char) data);
                output.write(data);
            }
            output.flush();
            output.close();
            doc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void FileReader(){
        try {
            FileReader fr = new FileReader("D:\\java_cy\\ultil\\test.txt");
            FileWriter fw = new FileWriter("D:\\java_cy\\ultil\\output.txt");
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
                fw.write(i);
            }
            fw.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void BufferedReader(){
        try {
            FileReader fr1 = new FileReader("D:\\java_cy\\ultil\\test.txt");
            BufferedReader br = new BufferedReader(fr1);
            FileWriter fw1 = new FileWriter("D:\\java_cy\\ultil\\output.txt");
            BufferedWriter bw = new BufferedWriter(fw1);

            int i;
            while ((i = br.read()) != -1){
                System.out.print((char) i);
                bw.write(i);
            }
            bw.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void BufferedInputStream(){
        try  {
            FileInputStream doc1 = new FileInputStream("D:\\java_cy\\ultil\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(doc1);
            FileOutputStream output1 = new FileOutputStream("D:\\java_cy\\ultil\\output.txt");
            BufferedOutputStream bws = new BufferedOutputStream(output1);
            int i;
            while ((i = bis.read()) != -1){
                System.out.print((char) i);
                bws.write(i);
            }
            bws.flush();
            bws.close();
            bis.close();
        }catch (Exception e){e.printStackTrace();}
    }
    public static void main(String[] args) {
        FileInputStream();
        FileReader();
        BufferedReader();
        BufferedInputStream();
    }
}
