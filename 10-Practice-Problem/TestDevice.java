interface Device { void turnOn(); void turnOff(); }
class Light implements Device {
    public void turnOn(){System.out.println("Light On");}
    public void turnOff(){System.out.println("Light Off");}
}
class AC implements Device {
    public void turnOn(){System.out.println("AC On");}
    public void turnOff(){System.out.println("AC Off");}
}
public class TestDevice {
    public static void main(String[] a){ Device d=new Light(); d.turnOn(); }
}