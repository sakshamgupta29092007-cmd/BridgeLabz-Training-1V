import java.util.function.*;
public class FuncTest {
    public static void main(String[] a){
        Predicate<Double> temp=t->t>40; 
        System.out.println(temp.test(45.0));
        Function<String,Integer> len=s->s.length(); 
        System.out.println(len.apply("Hello"));
        Runnable job=()->System.out.println("Task running");
         job.run();
    }
}