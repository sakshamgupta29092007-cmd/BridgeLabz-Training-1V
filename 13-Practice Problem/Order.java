class Order implements Runnable {
    private String id, restaurant, type; private int time, priority;
    Order(String id,String r,String t,int tm,int p){this.id=id;restaurant=r;type=t;time=tm;priority=p;}
    public void run(){
        Thread.currentThread().setPriority(priority);
        System.out.println("Order "+id+" picked up by "+Thread.currentThread().getName());
        try{Thread.sleep(time*1000);}catch(Exception e){}
        System.out.println("Order "+id+" delivered from "+restaurant+" in "+time+"s");
    }
    public static void main(String[] args){
        new Thread(new Order("O1","PizzaHut","Express",2,10),"Agent1").start();
        new Thread(new Order("O2","Dominos","Standard",4,5),"Agent2").start();
        new Thread(new Order("O3","KFC","Economy",5,3),"Agent3").start();
        new Thread(new Order("O4","Subway","Express",3,10),"Agent4").start();
        new Thread(new Order("O5","BurgerKing","Standard",4,5),"Agent5").start();
    }
}