package ObjectInputStreamExample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\ObjectInputStreamExample";
        ObjectMapper mapper = new ObjectMapper();
        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
           Cat cat = mapper.readValue(fileInputStream, Cat.class);
            System.out.println("name: " +cat.getMew() + "\n " + "age: " +cat.getAge());
        }catch (IOException exception){
            exception.getStackTrace();

        }
    }
}
