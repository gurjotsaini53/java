package Annotations.customAnnotations.classLevel;


@ToDoGo // if we use this annotation to create
public class ToDo {
    public ToDo(){
        System.out.println("ToDo");
    }

    public  void createToDoList()
    {
        System.out.println("Creating....");
    }

    public void notAllowed(){
        System.out.println("You are not allowed ");
    }
}
