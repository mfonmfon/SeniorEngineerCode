package transaction;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddListOfTransaction {

    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\OneDrive\\Desktop\\Chapter15\\src\\transaction";
        String fileName = location.concat("file.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        List<Transaction> transactions = new ArrayList<>();
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
            Transaction transaction = new Transaction(1L, BigDecimal.valueOf(100.5), "reference");
            mapper.writeValue(fileOutputStream, transaction);
        }catch (IOException exception) {
            exception.getStackTrace();
            System.out.println("Error sending data as json format" + exception.getMessage());
        }
    }
    public static Object printToJson(List<Transaction> transactions){
        Transaction transaction = new Transaction(1L, BigDecimal.valueOf(1000.99), "reference");
        Transaction transaction1 = new Transaction(2L, BigDecimal.valueOf(3000.0), "IT WORKS!!!!!!!!!" );
        Transaction transaction2 = new Transaction(3L, BigDecimal.valueOf(5000.54), "Yesssss");
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction);
        return Object.class;
    }

}
