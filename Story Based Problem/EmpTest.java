class Employee {
    int id; String name;
    Employee(int i,String n){id=i;name=n;}
    String email(){return name.toLowerCase()+"@company.com";}
}
class Manager extends Employee {
    String dept;
    Manager(int i,String n,String d){super(i,n);dept=d;}
    String email(){return name.toLowerCase()+"@"+dept+".company.com";}
}
public class EmpTest {
    public static void main(String[] a){
        Employee e=new Manager(1,"Riya","HR");
        System.out.println(e.email());
    }
}