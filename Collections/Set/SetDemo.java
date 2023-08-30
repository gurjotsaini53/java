package Collections.Set;

import java.util.*;

public class SetDemo {


    public static void main(String[] args) {
        /*
              Set<String> player = new HashSet<>();

        player.add("Player_01");
        player.add("Player_02");
        player.add("Player_03");
        player.add("Player_04");
        player.add("Player_05");
        player.add("Player_06");

        for (String name : player)
        {
            System.out.println(name);
        }
        System.out.println("---------------------------------------------------");

        HashSet<String> player1 = new HashSet<>();
        player1.add("Player_01");
        player1.add("Player_01");
        player1.add("Player_02");
        player1.add("Player_02");
        player1.add("Player_01");
        player1.add("Player_03");
        for (String name : player1)
        {
            System.out.println(name);
        }
        System.out.println("----------------Accessing through iterator------------------");


        Iterator<String> it = player1.iterator();

        while (it.hasNext())
        {
            String name = it.next();
            System.out.println(name);
        }


        System.out.println("--------------------------------");

        */


        HashSet<String> player = new HashSet<>();

        player.add("Player_02");
        player.add("Player_02");
        player.add("Player_01");
        player.add("Player_04");
        player.add("Player_01");
        player.add("Player_03");

        ArrayList<String>arrayList = new ArrayList<String>(player);

        for (String name : arrayList)
        {
            System.out.println(name);
        }
        

    }
}
