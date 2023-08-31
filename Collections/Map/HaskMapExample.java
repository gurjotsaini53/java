package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedMap;

public class HaskMapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> data = new HashMap<>();
        /*
        Add or Update value : put();
         */

        data.put(101,"Mercury");
        data.put(102,"Venus");
        data.put(103,"Earth");
        data.put(104,"Mars");
        data.put(105,"Jupitar");
        data.put(106,"Saturn");
        data.put(107,"Uranus");
        data.put(108,"Pluto");   // wrong

        data.put(108,"Neptune");   // update


        /*
        Size of hashmap : var.size();
         */
        System.out.println("size " + data.size());

        /*
        get values from the hashmap : get(key)
         */
        System.out.println(data.get(103));

        /*
        search the key : containsKey(key)
         */
        System.out.println(data.containsKey(102));
        System.out.println(data.containsKey(110));

        /*
        remove the key : remove(key)
         */
        System.out.println("Before removal " + data);
        data.remove(105);
        System.out.println("After removal " + data);
    }
}