package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<String> player = new ArrayList<String>();
        player.add("Player_01");
        player.add("Player_02");
        player.add("Player_03");
        player.add("Player_04");
        player.add("Player_05");

        System.out.println(player);

        for(String name : player)
        {
            System.out.println(name);
        }

        System.out.println("----------------------------------------------------------------");
        ArrayList<String> newTeam = new ArrayList<String>(player);
        System.out.println(newTeam);

        for(String name : newTeam)
        {
            System.out.println(name);
        }


        System.out.println("------------Accessing using Iterators-----------------------------");

        Iterator<String> teamIterator = newTeam.iterator();
        System.out.println(teamIterator.hasNext());


        while(teamIterator.hasNext())
        {
            String name = teamIterator.next();
            System.out.println(name);
        }

        System.out.println("------------Accessing Reverse elements using List Iterators-----------");

        ListIterator<String> teamListIterator= newTeam.listIterator(newTeam.size());
        while (teamListIterator.hasPrevious())
        {
            String name = teamListIterator.previous();
            System.out.println(name);
        }
    }
}
