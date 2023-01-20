package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {


    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        // Create object of class
        Queue<String> queue = new LinkedList<>();

        // add element
        queue.add("Ilyan");
        queue.add("ghani");
        queue.add("lilia");
        queue.add("djazira");

        System.out.println("using add method :");
        // print queue
        System.out.println(queue);


        // print using  for each loop to retrieve data
       System.out.println("using for each loop : ");
        for (String i :queue){
            System.out.println(i);
        }

        // print using iterator to retrieve data
        System.out.println("using iterator : ");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // use peek
        System.out.println("use peek :");
        String peek= queue.peek();
        System.out.println(peek);

        // use remove
        System.out.println("using remove :");
        queue.remove();
        System.out.println(queue);

        // use pool
        System.out.println("Use Pool :");
        while (queue.size()>0){
            String pool = queue.poll();
            System.out.println(pool);
        }





    }

}



