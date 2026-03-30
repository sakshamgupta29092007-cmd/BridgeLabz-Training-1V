import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface SecurityUtils {
    static boolean strong(String p){ return p.length()>8 && p.matches(".*\\d.*"); }
}
interface Converter {
    static double kmToMiles(double km){ return km*0.621; }
    static double kgToLbs(double kg){ return kg*2.204; }
}
interface DateUtil {
    static String format(LocalDate d){ return d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); }
}
public class StaticTest {
    public static void main(String[] a){
        System.out.println(SecurityUtils.strong("Pass1234"));
        System.out.println(Converter.kmToMiles(10));
        System.out.println(DateUtil.format(LocalDate.now()));
    }
}