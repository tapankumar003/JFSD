package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("core_java\\fileHandling\\demo.txt");
        System.out.println("file exist? "+file.exists());
        if(file.exists()){
            // writeFile(file);
            readFile(file);

        }else{
            file.createNewFile();
        }
        
    }

    public static void readFile(File file) throws IOException{
        InputStream inputStream = new FileInputStream(file);
        byte[] data = inputStream.readAllBytes();
        for(int i=0; i<data.length;i++){
            char ch = (char) data[i];
            System.out.print(ch);
        }
    }

    public static void writeFile(File file) throws IOException{
        OutputStream outputStream = new FileOutputStream(file);
        String name = "Tapan Kumar Mandal";
        outputStream.write(name.getBytes());
    }
}
