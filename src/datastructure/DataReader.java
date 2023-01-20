package datastructure;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class DataReader {

        public static void main(String[] args) throws ClassNotFoundException , SQLException {



            /*
             * User API to read the below textFile and print to console.
             * Use BufferedReader class.
             * Use try....catch block to handle Exception.
             *
             * Use MySql Database to store data and retrieve data.
             *
             * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
             * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
             * order from LinkedList and retrieve as FILO order from Stack.
             *
             * Demonstrate how to use Stack that includes push,peek,search,pop elements.
             * Use For Each loop/while loop/Iterator to retrieve data.
             */
            FileReader file = null;
            try {
                file = new FileReader("src/data/self-driving-car");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader bufferedReader = new BufferedReader(file);
            String s = null;
            String s1 = null;
            String s2 = null;
            String s3 = null;

            LinkedList<String> linkedList = new LinkedList<String>();
            Stack<String> stack = new Stack<>();
            while (true) {
                try {
                    if (!((s = bufferedReader.readLine()) != null)) break;
                    System.out.println("read the textFile and print to console:");
                    System.out.println(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }


                s1 = s.replace(",", "");
                s2 = s1.replace(".", "");
                s3 = s2.replace("!", "");

                String array[] = s3.split(" ");
                for (String l : array) {
                    linkedList.add(l);
                    stack.add(l);

                }

            }

            System.out.println(" the linkdelListe result");
            System.out.println(linkedList);

            System.out.println(" the stock result: ");
            System.out.println(stack);

           // use push
            stack.push("hafedha");
           stack.push("ilyan");
           System.out.println("use Stack that includes push : ");
           System.out.println(stack);

           // use peek
            System.out.println("use Stack that includes peek: ");
            System.out.println(stack.peek());

            //use pop
            System.out.println(stack);
            System.out.println("use Stack that includes pop:");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            //Search an elemet
            int location = stack.search("ilyan");
            System.out.println("Location :" +location);

            // how to use iterator to read stack
            System.out.println("how to use iterator to read stack:");
            Iterator iterator= stack.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
       }

            String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


        }


