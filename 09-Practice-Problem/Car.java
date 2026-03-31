abstract class Vehicle {
    private String vehicleNumber; private String type; private double rentalRate;
    public Vehicle(String v,String t,double r){vehicleNumber=v; type=t; rentalRate=r;}
    public abstract double calculateRentalCost(int days);
}
interface Insurable {double calculateInsurance(); String getInsuranceDetails();}
class Car extends Vehicle implements Insurable {
    public Car(String v){super(v,"Car",1000);}
    public double calculateRentalCost(int d){return d*1000;}
    public double calculateInsurance(){return 2000;}
    public String getInsuranceDetails(){return "Car insurance";}
}