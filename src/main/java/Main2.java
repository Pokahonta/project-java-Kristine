import Model.Flat;
import Model.Floor;
import Model.House;
import Model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        //Setting up rooms (6)
        Room roomNr1 = new Room();
        roomNr1.setHeight(3.00);
        roomNr1.setLightOn(false);

        Room roomNr2 = new Room();
        roomNr2.setHeight(3.10);
        roomNr2.setLightOn(false);

        Room roomNr3 = new Room();
        roomNr3.setHeight(2.90);
        roomNr3.setLightOn(true);

        Room roomNr4 = new Room();
        roomNr4.setHeight(9.00);
        roomNr4.setLightOn(false);

        Room roomNr5 = new Room();
        roomNr5.setHeight(9.00);
        roomNr5.setLightOn(true);

        Room roomNr6 = new Room();
        roomNr6.setHeight(7.00);
        roomNr6.setLightOn(false);

        //Setting up flats
        //sozdaem pustuju kvartiru
        Flat flatNr1 = new Flat();
        //chto vnutri kvartiri
        flatNr1.setArea(64.14);
        flatNr1.setNr(1);
        flatNr1.setOwner("Kostik");

        //spisok pustoj
        List<Room> roomsIn1 = new ArrayList<>();
        roomsIn1.add(roomNr1);
        roomsIn1.add(roomNr2);
        //spisok komnat dobavljaem v kvartiru
        flatNr1.setRooms(roomsIn1);

        //--------------------
        Flat flatNr2 = new Flat();
        //chto vnutri kvartiri
        flatNr2.setArea(34.14);
        flatNr2.setNr(2);
        flatNr2.setOwner("Kostik");

        //spisok pustoj
        List<Room> roomsIn2 = new ArrayList<>();
        roomsIn2.add(roomNr3);

        //spisok komnat dobavljaem v kvartiru
        flatNr2.setRooms(roomsIn2);


        //Setting up floors
        Floor floorNr1 = new Floor();
        floorNr1.setNr(1);

        List<Flat> flats = new ArrayList<>();
        flats.add(flatNr1);
        flats.add(flatNr2);

        floorNr1.setFlats(flats);


        //Setting up house
        House house  = new House();
        house.setNr(221);
        house.setStreetName("Baker str.");

        List<Floor> floors = new ArrayList<>();
        floors.add(floorNr1);
        floors.add(new Floor());

        house.setFloors(floors);

        System.out.println(house.getFloors().get(0).getFlats().get(0).getRooms().get(0).getHeight());










//        String text = "In the tweet, which was later deleted, the president thanked \"the great people of The Villages\" - referring to the retirement community north-west of Orlando where the rally took place. \"The Radical Left Do Nothing Democrats will Fall in the Fall. Corrupt Joe is shot. See you soon!!!,\" he wrote.";
//        //delim text na slova - schitaem kolicestvo slov//
//
//        String[] words = text.split(" ");
//        System.out.println(words.length);
//
//        //vivodim kazdoe vtoroe slovo v tekste. i-tekuwij indekss)
//       for (int i = 0; i < words.length; i = i + 2) {
//           System.out.println(words[i]);
//       }
//        // massiv :chto mi obxodim //
//      for (String word :words) {
//          System.out.println(word);
//        }
//
//      //spiski//
//        //dolzhi ukazatj dannie tipa, i on tolko odin//
//        List<String> names = new ArrayList<>();
//        names.add("Valerij");
//        names.add("Kostik the best");
//        names.add("Maxik");
//        names.add("uPsa - i eto aspirin");
//
//        //raspichatatj odnu//
//        System.out.println(names.get(1));
//
//        for (String name: names){
//            System.out.println(name);
//        }
//
//        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
//        bookUniqueWords.put("the", 1);
//        bookUniqueWords.put("student", 1);
//        bookUniqueWords.put("is", 1);
//        bookUniqueWords.put("the", 2);
//
//        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet())
//        System.out.println(entry.getKey());

    }
}
