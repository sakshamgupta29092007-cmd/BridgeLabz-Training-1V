interface Payment { void pay(double amt);
 }
class UPI implements Payment { public void pay(double amt)
    {
        System.out.println("UPI:"+amt);
    }
 }
class Card implements Payment { public void pay(double amt)
    {
        System.out.println("Card:"+amt);
    } 
}
public class PayTest { public static void main(String[] a)
    { 
        Payment p=new UPI(); p.pay(500);
    } 
}