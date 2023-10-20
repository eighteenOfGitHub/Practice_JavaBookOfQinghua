//12.3 Thread类与线程的创建
//12.3.2 使用Thread类
//使用Thread类直接创建SpeakCar和SpeakElephant
/*
使用到的类
    CarTarget
    ElephantTarget
*/

package bar12_3;

public class eg12_3_1 {
    public static void main(String[] args) {
        Thread speakElephant;                   //用Thread声明线程
        Thread speakCar;                        //用Thread声明线程
        ElephantTarget elephant;                //elephant是目标对象
        CarTarget car;                          //car是目标对象
        elephant = new ElephantTarget();        //创建目标对象
        car = new CarTarget();                  //创建目标对象
        speakElephant = new Thread(elephant);   //创建线程，其目标对象是elephant
        speakCar = new Thread(car);             //创建线程，其目标对象是car
        speakElephant.start();                  //启动线程
        speakCar.start();                       //启动线程
        for (int i = 1; i <= 15; i++) {
            System.out.print("主人"+i+" ");
        }
    }
}
