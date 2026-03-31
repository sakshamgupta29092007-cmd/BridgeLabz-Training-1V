abstract class Product {
    private int productId; private String name; private double price;
    public Product(int id,String n,double p){productId=id; name=n; price=p;}
    public abstract double calculateDiscount();
    public double getPrice(){return price;}
}
interface Taxable {double calculateTax(); String getTaxDetails();}
class Electronics extends Product implements Taxable {
    public Electronics(int id,String n,double p){super(id,n,p);}
    public double calculateDiscount(){return getPrice()*0.1;}
    public double calculateTax(){return getPrice()*0.18;}
    public String getTaxDetails(){return "18% GST";}
}