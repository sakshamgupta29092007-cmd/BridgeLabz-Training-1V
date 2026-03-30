class Student {
    String name; int marks;
    Student(String n,int m){name=n;marks=m;}
    String grade(){return marks>=50?"Pass":"Fail";}
}
class EngStudent extends Student {
    String branch;
    EngStudent(String n,int m,String b){super(n,m);branch=b;}
    String grade(){return super.grade()+" "+name+" "+branch;}
}
public class Uni {
    public static void main(String[] a){
        Student s=new EngStudent("Saksham",75,"CSE");
        System.out.println(s.grade());
    }
}