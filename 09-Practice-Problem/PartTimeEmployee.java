abstract class Employee {
    private int employeeId; private String name; private double baseSalary;
    public Employee(int id, String n, double s){employeeId=id; name=n; baseSalary=s;}
    public abstract double calculateSalary();
    public void displayDetails(){System.out.println(name+" earns "+calculateSalary());}
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id,String n,double s){super(id,n,s);}
    public double calculateSalary(){return superSalary();}
    private double superSalary(){return 50000;} // fixed
}
class PartTimeEmployee extends Employee {
    private int hours; private double rate;
    public PartTimeEmployee(int id,String n,double r,int h){super(id,n,0);rate=r;hours=h;}
    public double calculateSalary(){return rate*hours;}
}
interface Department {void assignDepartment(String d); String getDepartmentDetails();}