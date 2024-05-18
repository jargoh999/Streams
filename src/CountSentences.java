import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountSentences {


        public static void main(String[] args) {
            String filePath = "C:\\Users\\DELL\\Documents\\testFolder\\test.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                int sentenceCount = 0;
                String line;

                    while ((line = reader.readLine()) != null)

                    {
                     String[] sentences = line.split("([.?\\s!]\\s\\w)|^(\\b\\w)");
                     for (String sentence : sentences) {
                        String trimmedSentence = sentence.trim();
                        if (!trimmedSentence.isEmpty()) {
                            sentenceCount++;
                        }
                    }
                }

                System.out.println("Total number of sentences: " + sentenceCount);
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }




