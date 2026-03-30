class Course {
    String name; double price; static String platform="EduLearn";
    Course(String n,double p){name=toTitle(n);price=p;}
    double finalPrice(){return price;}
    static String toTitle(String s){return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();}
    void show(){System.out.println(name+" "+finalPrice());}
}
class Recorded extends Course {
    Recorded(String n,double p){super(n,p);}
    double finalPrice(){return price*0.9;}
}
class Live extends Course {
    Live(String n,double p){super(n,p);}
    double finalPrice(){return price*0.95;}
}
public class Platform {
    public static void main(String[] a){
        Course c=new Recorded("java",1000);
        System.out.println(Course.platform); c.show();
    }
}