
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

    public class DigitCounter {
        public static void main(String[] args) {

            System.out.println(countNumberOfDigits("C:\\Users\\DELL\\Documents\\testFolder\\test.txt"));
        }
        public static int countNumberOfDigits(String filePath) {

            try {
                String linesOfText = Files.readString(Path.of(filePath));
                int digitCount = 0;
                for (char character : linesOfText.toCharArray()) {
                    if (Character.isDigit(character)) {
                        digitCount++;
                    }
                }
                return digitCount;
            } catch (IOException e) {
                throw new RuntimeException("file not parseable");
            }

        }

    }



