import java.util.Random;
class Ticket extends Thread {
    private String type; private int priority; private static Random rand=new Random();
    Ticket(String name,String type,int p){super(name);this.type=type;priority=p;}
    public void run(){
        setPriority(priority);
        int t=rand.nextInt(5)+1;
        System.out.println(getName()+" handling "+type+" (Priority "+priority+")");
        try{Thread.sleep(t*1000);}catch(Exception e){}
        System.out.println(getName()+" completed "+type+" in "+t+"s");
    }
    public static void main(String[] args){
        new Ticket("T1","Critical Bug",10).start();
        new Ticket("T2","Feature Request",4).start();
        new Ticket("T3","General Query",2).start();
        new Ticket("T4","Feedback",1).start();
        new Ticket("T5","Critical Bug",10).start();
        new Ticket("T6","Feature Request",4).start();
        new Ticket("T7","General Query",2).start();
        new Ticket("T8","Feedback",1).start();
        new Ticket("T9","Critical Bug",10).start();
        new Ticket("T10","Feature Request",4).start();
    }
}