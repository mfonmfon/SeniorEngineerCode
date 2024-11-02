import ObjectInputStreamExample.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleFive {

    public static void main(String[] args) {
        Cat cat = new Cat("name", "12");
        String location = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\ObjectInputStreamExample";
        String fileName = location.concat("refresher");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try(var fileOutputStream = new FileOutputStream(fileName)){
            mapper.writeValue(fileOutputStream, cat);
        }catch (IOException exception) {
           exception.getStackTrace();
            System.out.println("Error writing to json file with msg" + exception.getMessage());
        }
    }
}
