//eg12_4_1

package bar12_4;

import java.time.LocalTime;

public class Target implements Runnable{
    public void run(){
        while(true){
            LocalTime time = LocalTime.now();
            try{Thread.sleep(1000);}
            catch(InterruptedException e){}
        }
    }
}
