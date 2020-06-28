import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String text = "In the tweet, which was later deleted, the president thanked \"the great people of The Villages\" - referring to the retirement community north-west of Orlando where the rally took place. \"The Radical Left Do Nothing Democrats will Fall in the Fall. Corrupt Joe is shot. See you soon!!!,\" he wrote.";
        //delim text na slova - schitaem kolicestvo slov//

        String[] words = text.split(" ");
        System.out.println(words.length);

        //vivodim kazdoe vtoroe slovo v tekste. i-tekuwij indekss)
       for (int i = 0; i < words.length; i = i + 2) {
           System.out.println(words[i]);
       }
        // massiv :chto mi obxodim //
      for (String word :words) {
          System.out.println(word);
        }

      //spiski//
        //dolzhi ukazatj dannie tipa, i on tolko odin//
        List<String> names = new ArrayList<>();
        names.add("Valerij");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("uPsa - i eto aspirin");

        //raspichatatj odnu//
        System.out.println(names.get(1));

        for (String name: names){
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet())
        System.out.println(entry.getKey());

    }
}
