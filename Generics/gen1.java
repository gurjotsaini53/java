package Generics;

import java.util.LinkedList;
import java.util.List;

public class gen1 {
    public static void main(String[] args) {
        List ll = new LinkedList<>();
        ll.add(new Integer(1));
//        Integer i = ll.iterator().next();
        Integer i = (Integer) ll.iterator().next();
        System.out.println(i);
    }
}
