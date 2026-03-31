abstract class FoodItem {
    private String name; private double price; private int qty;
    public FoodItem(String n,double p,int q){name=n;price=p;qty=q;}
    public String getName(){return name;} public double getPrice(){return price;} public int getQty(){return qty;}
    public abstract double calcTotal();
    public void show(){System.out.println(name+" x"+qty+" @"+price);}
}
interface Discountable {double discount(double total);}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String n,double p,int q){super(n,p,q);}
    public double calcTotal(){return getPrice()*getQty();}
    public double discount(double t){return t*0.1;}
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String n,double p,int q){super(n,p,q);}
    public double calcTotal(){return getPrice()*getQty()+20;}
    public double discount(double t){return t*0.05;}
}
public class FoodDemo {
    public static void main(String[] args){
        FoodItem[] order={new VegItem("Paneer",200,2),new NonVegItem("Chicken",300,1)};
        for(FoodItem f:order){
            f.show(); double total=f.calcTotal();
            if(f instanceof Discountable) total-=((Discountable)f).discount(total);
            System.out.println("Final: "+total);
        }
    }
}