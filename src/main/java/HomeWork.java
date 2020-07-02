import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main (String [] args){
        String bbcSport = "BBC Sport will have over 50 hours of programming for two weeks from 29 June, " +
                "including weekday rewinds of memorable matches, an Andy Murray Greatest Hits weekend " +
                "and a countdown of best finals.";

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("BBC", 1);
        bookUniqueWords.put("Sport", 1);
        bookUniqueWords.put("will", 1);
        bookUniqueWords.put("have", 1);
        bookUniqueWords.put("over", 1);
        bookUniqueWords.put("50", 1);
        bookUniqueWords.put("hours", 1);
        bookUniqueWords.put("of", 1);
        bookUniqueWords.put("programming", 1);
        bookUniqueWords.put("for", 1);
        bookUniqueWords.put("two" , 1);
        bookUniqueWords.put("weeks", 1);
        bookUniqueWords.put("from", 1);
        bookUniqueWords.put("29", 1);
        bookUniqueWords.put("June", 1);
        bookUniqueWords.put("including", 1);
        bookUniqueWords.put("weekday", 1);
        bookUniqueWords.put("rewinds", 1);
        bookUniqueWords.put("of", 1);
        bookUniqueWords.put("memorable", 1);
        bookUniqueWords.put("matches", 1);
        bookUniqueWords.put("an", 1);
        bookUniqueWords.put("Andy", 1);
        bookUniqueWords.put("Murray", 1);
        bookUniqueWords.put("Greatest", 1);
        bookUniqueWords.put("Hits", 1);
        bookUniqueWords.put("weekend", 1);
        bookUniqueWords.put("and", 1);
        bookUniqueWords.put("a", 1);
        bookUniqueWords.put("countdown", 1);
        bookUniqueWords.put("of", 1);
        bookUniqueWords.put("best", 1);
        bookUniqueWords.put("final", 1);

        for (Map.Entry<String, Integer> entry: bookUniqueWords.entrySet())
            System.out.println(entry.getKey());




    }


}
