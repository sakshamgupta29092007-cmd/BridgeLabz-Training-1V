interface Vehicle { void rent(); void returnVehicle(); }
class Car implements Vehicle {
    public void rent(){System.out.println("Car rented");}
    public void returnVehicle(){System.out.println("Car returned");}
}
public class Rental {
    public static void main(String[] a){ Vehicle v=new Car(); v.rent(); }
}