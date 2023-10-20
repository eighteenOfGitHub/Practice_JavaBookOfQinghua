//12.3.2 使用Thread类
//猫和狗喝同一桶水
/*
使用到的类
    House1
*/

package bar12_3;

public class eg12_3_2 {
    public static void main(String[] args) {
        House1 house1 = new House1();
        house1.setWater(10);
        Thread dog,cat;
        dog = new Thread(house1);    //dog和cat的目标对象相同
        cat = new Thread(house1);    //cat和dog的目标对象相同
        dog.setName("狗");
        cat.setName("猫");
        dog.start();
        cat.start();
    }
}
