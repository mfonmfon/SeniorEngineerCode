import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExampleNine {

    public static void main(String[] args) {
        String text = "How brooo";
        String location = ";";
        Path path = Path.of(location,"file.txt");
        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}