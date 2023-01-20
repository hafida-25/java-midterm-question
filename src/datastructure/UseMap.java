package datastructure;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */
        ArrayList<String> ListOfCityAlgerian = new ArrayList<>();
        ListOfCityAlgerian.add("boghni");
        ListOfCityAlgerian.add("mechtras");
        ListOfCityAlgerian.add("athmandas");
        ListOfCityAlgerian.add("bejia");

        ArrayList<String> ListOfCityFrance = new ArrayList<>();
        ListOfCityFrance.add("tolouse ");
        ListOfCityFrance.add(" marseille");
        ListOfCityFrance.add("lyon ");
        ListOfCityFrance.add(" paris");

           // Add Keys
        HashMap<String,ArrayList> CountryMap = new HashMap<>();
        CountryMap.put("tiziouzou",ListOfCityAlgerian);
        CountryMap.put("Montpellier",ListOfCityFrance);

       //Access an Item
        System.out.println(" How Access an Item:" );
        System.out.println(CountryMap.get("tiziouzou"));

        // get a key
        System.out.println(" print a Key:");
        for(String i:CountryMap.keySet()){
      System.out.println(i);
  }

        // get a value
        System.out.println("print a value:");
        for (ArrayList j:CountryMap.values()){
            System.out.println(j);
        }
        // find how many items there are
        System.out.println(" size :");
        System.out.println(CountryMap.size());

        // use for loop
        System.out.println(" read hashmap using For Loop: ");
        for (Map.Entry i : CountryMap.entrySet()){
            System.out.println(i.getKey() +" "+ i.getValue());
        }

        // Use Iterator
        System.out.println(" read hashmap using iteratro:");
        Iterator iterator=CountryMap.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}


