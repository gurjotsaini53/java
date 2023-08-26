package CRUD;

public class Main {

    public static void main(String[] args) {


        CRUD obj = new CRUD();
        System.out.println("Emp added : " + obj.addEmployee(5554, "Gurjot"));

        obj.showEmployee();

        CRUD obj2 = new CRUD() ;
        System.out.println("Emp added : " + obj2.addEmployee(5556, "Madav"));
        obj2.showEmployee();

        obj2.deleteEmployee(2);
        obj2.showEmployee();

        CRUD obj3 = new CRUD() ;
        System.out.println("Emp added : " + obj3.addEmployee(5558, "Ansh"));
        obj3.showEmployee();


        obj3.updateEmployee(5555,"Ayushi");
        obj3.showEmployee();

    }
}
