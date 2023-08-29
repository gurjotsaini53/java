package Collections.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String [] arr = new String[] {"Steve","Tim","Lucy","Pat","Angela","Tom"};

        // 1. using Arrays.asList() methods

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);

        // 2. Using collection.addAll() Method

        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1,arr);
        System.out.println(list1);

        // 3. ArrayList.addAll() method

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(arr));
        System.out.println(arrayList);
    }
}
