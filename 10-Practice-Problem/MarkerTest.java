interface BackupMarker {} // custom marker
class Data implements java.io.Serializable, Cloneable, BackupMarker {
    int id; String info;
}
public class MarkerTest {
    public static void main(String[] a){
        Data d=new Data(); System.out.println("Marked for backup & clone");
    }
}