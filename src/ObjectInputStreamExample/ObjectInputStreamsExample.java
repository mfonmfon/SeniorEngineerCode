package ObjectInputStreamExample;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectInputStreamsExample {

    public static void main(String[] args) {

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)){
            Cat cat  =
                    new Cat("'https://jsonplaceholder.typicode.com/todos/1'", "12");
            objectOutputStream.writeObject(cat);
            System.out.println(objectOutputStream);
        }
       catch (IOException exception) {
            exception.getStackTrace();
            throw new RuntimeException(exception);
        }
    }



}
