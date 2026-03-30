class Product {
    String name; Product(String n){name=n;}
    boolean isMatch(String k){return name.toLowerCase().contains(k.toLowerCase());}
}
class Electronic extends Product {
    String brand; Electronic(String n,String b){super(n);brand=b;}
    boolean isMatch(String k){return super.isMatch(k)||brand.equalsIgnoreCase(k);}
}
public class Shop {
    public static void main(String[] a){
        Product p=new Electronic("Laptop","Dell");
        System.out.println(p.isMatch("Dell"));
    }
}