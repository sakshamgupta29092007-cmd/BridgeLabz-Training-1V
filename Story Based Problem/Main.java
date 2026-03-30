class Book {
    int id; String title; double price;
    static String libraryName="City Library";
    Book(int i,String t,double p){id=i;title=t;price=p;}
    double calculateFine(int d){return 0;}
}
class TextBook extends Book {
    TextBook(int i,String t,double p){super(i,t,p);}
    double calculateFine(int d){return d*2;}
}
class Magazine extends Book {
    Magazine(int i,String t,double p){super(i,t,p);}
    double calculateFine(int d){return d*5;}
}
public class Main {
    public static void main(String[] a){
        Book b=new TextBook(1,"Math",200);
        System.out.println(Book.libraryName+" Fine:"+b.calculateFine(3));
    }
}