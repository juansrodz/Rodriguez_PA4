import java.util.*;
import java.io.*;

public class DuplicateCounter {

    private static Map<String, Integer> wordCounter;
    private static int counter = 0;

    public static void count (String dataFile) throws IOException {

        Scanner in = new Scanner(new File(dataFile));
        wordCounter = new HashMap<>();
        int count = 0; 

        while(in.hasNext())
            wordCounter.put(in.next(), count);
            count++;

        // for(String string: wordCounter)
        //     System.out.println(string);

        counter = wordCounter.size();

        write ("unique_word_counts.txt");

        in.close();
    }

    public static void write (String dataFile) throws IOException{
        PrintWriter writer = new PrintWriter(dataFile);       
        writer.println(counter);
        writer.close();
    }


}