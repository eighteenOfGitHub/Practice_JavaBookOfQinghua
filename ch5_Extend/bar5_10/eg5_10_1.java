package bar5_10;

public class eg5_10_1 {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom = null;
        pillar = new Pillar(bottom,100);        //没有底的柱体
        System.out.println("体积 " + pillar.getVolume());
        bottom = new Rectangle(12,22);              // pillar 底面为矩形
        pillar = new Pillar(bottom, 58);
        System.out.println("体积 " + pillar.getVolume());
        bottom = new Circle(10);                        //pillar 底面为圆形
        pillar = new Pillar(bottom,58);
        System.out.println("体积 " + pillar.getVolume());
    }
}
