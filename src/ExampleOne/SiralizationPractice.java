package ExampleOne;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SiralizationPractice {

    public static void main(String[] args) throws FileNotFoundException {

        String  location = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\ExampleOne\\";
        String fileName = location.concat("output.txt");
//        String text = "Welcome to Sparkle Mfon\n";
        try(FileInputStream inputStream = new FileInputStream(fileName)){
            byte[] data = inputStream.readAllBytes();
            System.out.println(Arrays.toString(data));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }



}
