package FileReaderExampleThree;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleThree {
    public static void main(String[] args) {
        String location =  "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\FileReaderExampleThree";
        String fileName = location.concat("mine.txt");
        try(FileReader fileReader = new FileReader(fileName)){
            fileReader.read();
            char[] data = new char[20024];
            System.out.println(" " + new String(data));
        }
        catch (IOException exception){
            System.err.println("ERROR: " +exception.getMessage());
        }
    }
}
