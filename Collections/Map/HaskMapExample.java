package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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


        System.out.println("---------print statement----------------");

        // 1. Print statement
        System.out.println(data);

        System.out.println("---------entrySet() methods----------------");

        // 2. entrySet() enthod

        for(Map.Entry<Integer,String> entry : data.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("---------keySet() methods----------------");


        // 3. KeySet() methods

        for (Integer x : data.keySet())
        {
            System.out.println(x);
        }
        System.out.println("---------values() method----------------");
        // 4. values() methods
        for (String value :  data.values())
        {
            System.out.println(value);
        }
        System.out.println("---------forEach Loop----------------");

        // 5. forEach loop
        data.entrySet().forEach( entry ->{
            System.out.println(entry.getKey()+ " " +entry.getValue());
        });
    }
}