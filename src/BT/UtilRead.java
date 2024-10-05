package BT;

import java.io.*;
import java.util.Arrays;

public class UtilRead {
    public  String TEXT = "D:\\text.txt";
    public  String TEXT1 = "D:\\output.txt";

    public void fileReader() {
        try (FileInputStream doc = new FileInputStream(TEXT);
             FileOutputStream doc1 = new FileOutputStream(TEXT1)) {

            int data;
            StringBuilder sb = new StringBuilder();

            while ((data = doc.read()) != -1) {
                sb.append((char) data);
            }

            String result = sb.toString();
            doc1.write(result.getBytes());

            System.out.println(result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileBufferedInputStream() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(TEXT1);
            try ( BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(TEXT)) ; BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream) ) {
                int c;
                StringBuilder sb = new StringBuilder();
                while ((c = bufferedInputStream.read()) != -1){
                    System.out.print((char)c);
                    sb.append((char) c);
                }
                String result = sb.toString();
                bufferedOutputStream.write(result.getBytes());

                System.out.println(result);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

    }
    public void fileReader1(){
        try(FileReader fileReader = new FileReader(TEXT) ;FileWriter fileWriter = new FileWriter(TEXT1) ){
            char[] a = new char[10];
            fileReader.read(a);
            for ( char b :a
                 ) {
                System.out.print(b);
            }
            fileWriter.write(a);



        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void bufferReader(){
        try {
            FileReader fileReader = new FileReader(TEXT);
            FileWriter fileWriter = new FileWriter(TEXT1);

            try(BufferedReader bufferedReader = new BufferedReader(fileReader) ; BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                String i;
                StringBuilder stringBuilder = new StringBuilder();
                while ((i=bufferedReader.readLine()) != null  ){
                    System.out.print( i);
                    stringBuilder.append( i);

                }
                String result = stringBuilder.toString();
                bufferedWriter.write(Arrays.toString(result.getBytes()));

                System.out.println(result);

            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){

        }

    }

}
