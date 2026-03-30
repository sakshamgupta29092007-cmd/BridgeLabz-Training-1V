class Order {
    int id; double amt; static double charge=40;
    Order(int i,double a){id=i;amt=a;}
    double calculateBill(){return amt+charge;}
}
class PremiumOrder extends Order {
    PremiumOrder(int i,double a){super(i,a);}
    double calculateBill(){return amt*0.8+charge;}
}
public class FoodApp {
    public static void main(String[] a){
        Order o=new PremiumOrder(1,500);
        System.out.println("Bill:"+o.calculateBill());
    }
}