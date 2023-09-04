package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EmpDetails {
    public static void main(String[] args) {


        Map <String,List<String>> EmpDetailsMap = new HashMap<>();

        List<String> objEmp1 = new ArrayList<>();

        /*
        key value pair
         */
        EmpDetailsMap.put("A",objEmp1);


        /*
        values of array
         */

        EmpDetailsMap.get("A").add("Gurjot");
        EmpDetailsMap.get("A").add("Madhav");
        EmpDetailsMap.get("A").add("Ayushi");
        EmpDetailsMap.get("A").add("Ansh");

        System.out.println(EmpDetailsMap);

        List<String> objEmp2 = new ArrayList<>();

        EmpDetailsMap.put("B",objEmp2);


        EmpDetailsMap.get("B").add("Guri");
        EmpDetailsMap.get("B").add("Madhav");
      ;

        System.out.println(EmpDetailsMap);



        // or
         objEmp2.add("Cat");
        objEmp2.add("Dog");


        System.out.println(EmpDetailsMap);


        EmpDetailsMap.entrySet().forEach( entry ->{
            System.out.print(entry.getKey()+ " =  ");

        for (String x : entry.getValue()){
            System.out.print(x + ",");
        }

            System.out.println();
        });

    }
}
