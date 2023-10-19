//8.9.2 使用Class实例化一个对象

package bar8_9;

import java.lang.reflect.Constructor;

public class eg8_9_2 {
    public static void main(String[] args) {
        try{
            //也可以"Class<?> cs = Circle.class;",但缺乏灵活性
            Class<?> cs = Class.forName("bar8_9.Circle");
            //返回不带参数的构造方法，封装在Constructor<?>对象structure中
            Constructor<?> structure = cs.getDeclaredConstructor();
            Circle circle = (Circle)structure.newInstance();    //实例化Circle对象
            circle.setRadius(100);
            double area = circle.getArea();
            String formatStr = String.format("%10.2f",area);
            System.out.println("circle的半径："+circle.radius);
            System.out.println("circle的面积，保留两位小数：\n"+area);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
