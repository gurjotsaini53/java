package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


 class Player {
    private String name;
    private int age;

    public Player(String name , int age){
        this.age=age;
        this.name = name;
    }

    public String getName()
    {
        return name;

    }

    public int getAge(){
        return age;

    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age= age;
    }


}
public class Players {
    public static void main(String[] args) {
        List<Player> p = new ArrayList<>();

        p.add(new Player("Gurjot",20));
        p.add(new Player("Ansh",19));
        p.add(new Player("Ayushi",19));
        p.add(new Player("Ayush",19));

        for (Player x : p)
        {
            System.out.println("Name : " + x.getName() + ", Age : " + x.getAge());
        }

        System.out.println("---------------using itertor-----------------------------------");

        Iterator<Player> It = p.iterator();

        while (It.hasNext())
        {
            Player obj = It.next();
            System.out.println("Name : " + obj.getName() + ", Age : " + obj.getAge());
        }

        System.out.println("---------------using list itertor-----------------------------------");

        ListIterator<Player> List_it = p.listIterator();

        while (List_it.hasNext())
        {
            Player obj = List_it.next();
            System.out.println("Name : " + obj.getName() + ", Age : " + obj.getAge());
        }

        System.out.println("---------------using list itertor (backward)-----------------------------------");

        ListIterator<Player> List_it_back = p.listIterator(p.size());

        while (List_it_back.hasPrevious())
        {
            Player obj = List_it_back.previous();
            System.out.println("Name : " + obj.getName() + ", Age : " + obj.getAge());
        }
    }
}
