class Activity implements Runnable {
    private String name; private int delay; private int priority;
    Activity(String n,int d,int p){name=n;delay=d;priority=p;}
    public void run(){
        try{Thread.sleep(delay*1000);}catch(Exception e){}
        Thread.currentThread().setPriority(priority);
        System.out.println(name+" started, State: RUNNING, Priority: "+priority);
    }
    public static void main(String[] args){
        new Thread(new Activity("Student Entry",0,5)).start();
        new Thread(new Activity("Question Paper Distribution",5,10)).start();
        new Thread(new Activity("Attendance Marking",10,8)).start();
        new Thread(new Activity("Answer Sheet Collection",15,7)).start();
    }
}