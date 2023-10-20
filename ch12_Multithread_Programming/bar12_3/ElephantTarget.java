//eg12_3_1

package bar12_3;

public class ElephantTarget implements Runnable{    //实现Runnable接口
    public void run(){
        for (int i = 1; i <= 20; i++) {
            System.out.print("大象"+i+" ");
        }
    }
}
