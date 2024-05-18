import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class JsonReaderExample {
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL\\Documents\\testFolder\\test.json";
        System.out.println(collectAndConvertValues(path));
    }


    public static double collectAndConvertValues(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
             var file = new File(path);
            Transaction[] transactions = objectMapper.readValue(file, Transaction[].class);
            return Arrays.stream(transactions).mapToDouble(Transaction::getAmount).sum();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }



}



