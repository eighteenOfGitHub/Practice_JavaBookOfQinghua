//12.8 GUI线程
//start，stop控制报时

/*
问题      当单击一个按钮让线程开始运行，这个线程run()跑完，
          可能会再次单击，这样就会二次start()，从而报错

方法      isAlive()判断线程是否还存活
*/

package bar12_8;

public class eg12_8_2 {
    public static void main(String[] args) {
        Win win = new Win();
    }
}
