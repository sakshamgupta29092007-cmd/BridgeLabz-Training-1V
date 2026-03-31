abstract class VehicleRide {
    private int vehicleId; private String driverName; private double ratePerKm;
    public VehicleRide(int v,String d,double r){vehicleId=v; driverName=d; ratePerKm=r;}
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){System.out.println(driverName+" driving "+vehicleId);}
}
interface GPS {String getCurrentLocation(); void updateLocation(String loc);}
class CarRide extends VehicleRide implements GPS {
    public CarRide(int v,String d){super(v,d,15);}
    public double calculateFare(double dist){return dist*15;}
    public String getCurrentLocation(){return "City Center";}
    public void updateLocation(String loc){System.out.println("Updated to "+loc);}
}