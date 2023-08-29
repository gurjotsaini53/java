package Collections.List;

import java.util.ArrayList;
import java.util.Collection;

public class PlayerList {

     public PlayerList(){

     }

    public static void main(String[] args) {
        Collection<String> player = new ArrayList<String>();
        player.add("Player_01");
        player.add("Player_02");
        player.add("Player_03");
        player.add("Player_04");
        player.add("Player_05");

        for(String name : player)
        {
            System.out.println(name);
        }
    }
}
