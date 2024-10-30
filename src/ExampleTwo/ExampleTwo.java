package ExampleTwo;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ExampleTwo {

    public static void main(String[] args) throws FileNotFoundException {

        String location = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\ExampleTwo";
        String fileName = location.concat("output.txt");
        String text = "";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName, true)){
          fileOutputStream.write(text.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
