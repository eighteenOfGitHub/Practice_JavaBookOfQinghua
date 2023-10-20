//12.3.3 目标对象与线程的关系
//目标对象组合线程（弱耦合）,即将线程作为自己的成员
/*
使用到的类
    House2
*/


package bar12_3;

public class eg12_3_3 {
    public static void main(String[] args) {
        House2 house = new House2();
        house.setWater(10);
        house.dog.start();
        house.cat.start();
    }
}
