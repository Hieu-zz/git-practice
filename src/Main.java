import utils.DocFile;
import utils.GhiFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        DocFile docFile = new DocFile();
        GhiFile ghiFile = new GhiFile();
//        docFile.docByFileInputStream();
//        docFile.docByBufferedInputStream();
//        docFile.docByFileReader();
//        docFile.docByBufferedReader();

//        ghiFile.ghiByFileOutputStream();
//        ghiFile.ghiByBufferOutputStream();
//        ghiFile.ghiByFileWriter();
        ghiFile.ghiByBufferWriter();
    }
}