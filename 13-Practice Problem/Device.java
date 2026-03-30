class Device implements Runnable {
    private String name; private int interval; private int priority;
    Device(String n,int i,int p){name=n;interval=i;priority=p;}
    public void run(){
        Thread.currentThread().setPriority(priority);
        for(int c=1;c<=5;c++){
            System.out.println(name+" cycle "+c+" at "+System.currentTimeMillis());
            try{Thread.sleep(interval*1000);}catch(Exception e){}
        }
    }
    public static void main(String[] args){
        new Thread(new Device("Security Camera",3,10)).start();
        new Thread(new Device("Temperature Sensor",5,7)).start();
        new Thread(new Device("Light Controller",4,5)).start();
        new Thread(new Device("Door Lock Monitor",6,5)).start();
    }
}