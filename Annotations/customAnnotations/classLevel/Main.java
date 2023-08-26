package Annotations.customAnnotations.classLevel;

public class Main {
    public Main(){

    }

    @SuppressWarnings("Unused")
    public static void main(String[] args)
    {
        ToDo obj  =  new ToDo();
        if (obj.getClass().isAnnotationPresent(ToDoGo.class))
        {
            obj.createToDoList();
        }
        else {
            obj.notAllowed();
        }
    }
}
