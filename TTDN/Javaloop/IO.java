import java.io.*;

public class IO {
    public static void  FileInputStream(){
        try {
            FileInputStream doc = new FileInputStream("E:\\TTDN\\Javaloop\\test.txt");
            FileOutputStream o = new FileOutputStream("E:\\TTDN\\Javaloop\\output.txt");

            int data;
            while ((data = doc.read())!=-1){
                System.out.print((char) data);
                o.write(data);
            }
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  BufferInputStream() {
        try {
            BufferedInputStream doc = new BufferedInputStream(new FileInputStream("E:\\TTDN\\Javaloop\\test.txt"));
            BufferedOutputStream o = new BufferedOutputStream(new FileOutputStream("E:\\TTDN\\Javaloop\\output.txt"));

            int data;
            while ((data = doc.read()) != -1) {
                System.out.print((char) data);
                o.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  FileReader(){
        try {
            FileReader doc = new FileReader("E:\\TTDN\\Javaloop\\test.txt");
            FileWriter o = new FileWriter("E:\\TTDN\\Javaloop\\output.txt");

            int data;
            while ((data = doc.read())!=-1){
                System.out.print((char) data);
                o.write(data);
            }
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  BufferReader() {
        try {
            BufferedReader doc = new BufferedReader(new FileReader("E:\\TTDN\\Javaloop\\test.txt"));
            BufferedWriter o = new BufferedWriter(new FileWriter("E:\\TTDN\\Javaloop\\output.txt"));

            String line;
            while ((line = doc.readLine()) != null){
                System.out.println(line);
                o.write(line);
                o.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FileInputStream();
        System.out.println();
        BufferInputStream();
        System.out.println();
        FileReader();
        System.out.println();
        BufferReader();
    }
}
