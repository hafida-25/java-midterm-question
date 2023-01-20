package datastructure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        // collection view of the map
        System.out.println("Collection view is : " +map.values());

// using Iterator
        System.out.println(" retrieve collection view by using iterator:");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry value=(Map.Entry)iterator.next();
            System.out.println(value.getValue());
        }
    }

}




