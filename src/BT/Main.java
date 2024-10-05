package BT;

public class Main {

    public static void main(String[] args) {
        UtilRead util = new UtilRead();

        util.fileReader();
        System.out.println("\n");
        util.fileBufferedInputStream();
        System.out.println("\n");
        util.fileReader1();
        System.out.println("\n");
        util.bufferReader();
        System.out.println("\n");


    }
}