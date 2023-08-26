package CRUD;

public class Employee implements Insertable, Deletable , Updatable{

    private String name;
    private int EmpID;

    private int serialNo;
    private int empAadharCardNumber;
    private int empPanNumber;

    // constructor
    public Employee(){

    }

    public Employee(int id ,String name ){

        this.name=name;
        this.EmpID=id;
    }

    public int getSerialNo(){
        return serialNo;
    }

    public int getEmpId(){
        return EmpID;
    }

    public String getEmpName (){
        return name;
    }

    public int getEmpAadharCardNumber(){
        return empAadharCardNumber;
    }
    public int getEmpPanNumber(){
        return empPanNumber;
    }


    public void setEmpID(int id) {

        this.EmpID=id;

    }
    public void setEmpName(String name)
    {
        this.name=name;
    }
}
