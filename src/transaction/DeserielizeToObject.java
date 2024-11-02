package transaction;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class DeserielizeToObject {

    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\ObjectInputStreamExample";
        ObjectMapper mapper = new ObjectMapper();
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation)){
            List<Photo> photos = mapper.readValue(fileInputStream, new TypeReference<List<Photo>>() {
            });
            for (Photo albumList: photos){
                if (albumList.getId() % 3 == 0){
                    System.out.println(albumList);
                }
            }
        }catch (IOException exception){
            exception.getStackTrace();
            System.out.println("Error trying to get list of object "+exception.getMessage());
        }
    }
}
