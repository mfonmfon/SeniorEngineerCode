package InformationSender;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InformationSender {
    public static void main(String[] args) throws IOException {
//        System.out.println( "Hello \n".repeat(100)); //count numbers for 100 times
//        PrintStream destination = System.out;
        String text = "How my guy";
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15")){
            byte[] data = text.getBytes();
            fileOutputStream.write(data);
        }catch (IOException exception){

        }
    }
}
