package bar13_3;

import java.io.DataInputStream;
import java.io.IOException;

public class Read implements Runnable{
    DataInputStream in;
    public void setDataInputStream(DataInputStream in){
        this.in = in;
    }
    public void run(){
        double result = 0;
        while(true){
            try{
                result = in.readDouble();       //读取服务器发送来的信息
                System.out.println("圆的面积："+result);
                System.out.print("输入圆的半径（放弃请输入N）：");
            }
            catch(IOException el){
                System.out.println("与服务器已断开"+el);
                break;
            }
        }
    }
}