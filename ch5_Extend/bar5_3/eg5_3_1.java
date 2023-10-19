//5.3.1 子类对象的特点
//  子类继承的方法只能操作子类继承的成员变量或未继承的成员变量，不可以操作子类新声明的变量

package bar5_3;

class People{
    private int averHeight = 166;
    public int getAverHeight() {
        return averHeight;
    }
}

class ChinaPeople extends People{
    int height;
    public void setHeight(int h){
        //height = h + averHeight;      //非法，之类没有继承 averHeight
        height = h;
    }
    public int getHeight(){
        return height;
    }
}

public class eg5_3_1 {
    public static void main(String[] args) {
        ChinaPeople zhangSan = new ChinaPeople();
        System.out.println("子类对象未继承的 averageHeight 的值是：" + zhangSan.getAverHeight());
        zhangSan.setHeight(178);
        System.out.println("子类对象的实例变量 height 的值是：" + zhangSan.getHeight());
    }
}
