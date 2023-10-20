//eg12_3_3

package bar12_3;

public class House2 implements Runnable{
    int waterAmount;            //用int型变量模拟水量
    Thread dog,cat;             //线程是目标对象的成员
    House2(){
        dog = new Thread(this);
        cat = new Thread(this);
    }
    public void setWater(int w){
        waterAmount = w;
    }
    public void run(){
        while(true){
            Thread t = Thread.currentThread();
            if(t == dog){
                System.out.println("家狗喝水");
                waterAmount = waterAmount - 2;
            } else if (t == cat) {
                System.out.println("家猫喝水");
                waterAmount = waterAmount - 1;
            }
            System.out.println("剩"+waterAmount);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ee){}
            if(waterAmount <= 0)
                return;
        }
    }
}
