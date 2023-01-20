package datastructure;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        // Create ArrayList object
        ArrayList<String> cities = new ArrayList<>();

        // Add items(we use add)
        cities.add("florida");
        cities.add("california");
        cities.add("colorado");
        cities.add("kansas");
        cities.add("philadelphia");
        System.out.println(cities);

        // use the get() methode to access an element in the arraylist

        cities.get(1);
        System.out.println(cities);


        //Chang an item using  the set() method

        cities.set(1, "las vegas");
        System.out.println(cities);

        // remove an item
        cities.remove(0);
        System.out.println(cities);

        // to find how many element in arraylist
        cities.size();
        System.out.println(cities);

        // another method to add with a for loop

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // We Can Also Add items using for-each
        for (String i : cities) {
            System.out.println(i);
        }

        // use do while loop to add iteam
        int i = 0;
        do {
            System.out.println(cities.get(i));
            i++;
        }
        while (i < cities.size());


        // use while loop
        int j=0;
        while (j<cities.size());
        System.out.println(cities.get(j));
        j++;

        // with iterator class
        Iterator iterator = cities.iterator();
        while (iterator.hasNext()) {
            String a = iterator.next().toString();
            System.out.println(a);

        }



    }
    }





