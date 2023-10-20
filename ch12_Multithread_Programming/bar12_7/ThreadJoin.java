package bar12_7;

public class ThreadJoin implements Runnable{
    Cake cake;
    Thread customer,cakeMaker;
    public void setThread(Thread ...t){
        customer = t[0];
        cakeMaker = t[1];
    }
    public void run(){
        if(Thread.currentThread() == customer){
            System.out.println(customer.getName()+"等待"+cakeMaker.getName()+"制作生日蛋糕");
            try{
                cakeMaker.start();
                cakeMaker.join();   //当前线程开始等待cakeMaker结束
            }catch(InterruptedException e){}
            System.out.println(customer.getName()+"买了"+cake.name+"，价钱："+cake.price);

        } else if (Thread.currentThread() == cakeMaker) {
            System.out.println(cakeMaker.getName()+"开始制作生日蛋糕，请稍等……");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            cake = new Cake("生日蛋糕",158);
            System.out.println(cakeMaker.getName() + "制作完毕");
        }
    }
    class Cake{
        int price;
        String name;
        Cake(String name,int price){
            this.name = name;
            this.price = price;
        }
    }
}
