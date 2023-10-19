package bar4_3;


//参数的引用
public class eg4_3_2 {
    public static void main(String[] args) {
        Point p1 = null,p2 = null;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1 的引用：" + p1);
        System.out.println("p2 的引用：" + p2);
        p1.setXY(1111,2222);
        p2.setXY(-100,-200);
        System.out.println("p1 的 x,y 坐标：" + p1.x + "," + p1.y);
        System.out.println("p2 的 x,y 坐标：" + p2.x + "," + p2.y);
        p1 = p2;
        System.out.println("将 p2 的引用赋给 p1 后：");
        int address = System.identityHashCode(p1);
        System.out.printf("p1 的引用：%x\n",address);
        address = System.identityHashCode(p2);
        System.out.printf("p2 的引用：%x\n",address);
        System.out.println("p1 的 x,y 坐标：" + p1.x + "," + p1.y);
        System.out.println("p2 的 x,y 坐标：" + p2.x + "," + p2.y);
    }
}
