package CRUD;

public class CRUD {

    Employee emp;
    public CRUD(){
        emp = new Employee();
    }

    public int addEmployee(int id , String name)
    {
        if(emp instanceof Insertable)
        {
            emp.setEmpID(id);
            emp.setEmpName(name);
            return 1;
        }
        return 0;
    }


     public int deleteEmployee(int id){
        if (emp instanceof Deletable)
        {
            emp.setEmpName(null);
            emp.setEmpID(-1);
            System.out.println("Emp Deleted");
            return 1;

        }
        return 0;
     }
    public void showEmployee()
    {
        System.out.println("Serial no. : "  + emp.getSerialNo() +  "\nName : " + emp.getEmpName() + "\nId : " + emp.getEmpId());
        System.out.println("------------------------");
    }


    public int updateEmployee(int id , String name)
    {

        if (emp instanceof Updatable) {
            emp.setEmpID(id);
            emp.setEmpName(name);
            System.out.println("Emp data Updated");
            System.out.println("------------------------");
            return 1;
        }
        return 0;
    }



}
