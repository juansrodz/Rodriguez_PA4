import java.util.*;
import java.io.*;

public class DuplicateRemover {

    private static Set<String> uniqueWords;

    public static void remove (String dataFile) throws IOException {

        Scanner in = new Scanner(new File(dataFile));
        uniqueWords = new HashSet<>(); 
         
        while (in.hasNext())
        uniqueWords.add(in.next());
        
        // for(String string : uniqueWords)
        //     System.out.println(string);

        write ("unique_words.txt.");

       in.close();        
    }

    public static void write (String dataFile) throws IOException{
        PrintWriter writer = new PrintWriter(dataFile);       
        writer.println(uniqueWords);
        writer.close();
    }
}