//7.1 内部类

package bar7_1;

public class eg7_1_1 {
    public static void main(String[] args) {
        RedCowFarm farm = new RedCowFarm("红牛牧场");       //非 Static 内部类创建对象
        farm.showCowMess();
        farm.cow.speak();

        RedCowFarm.RedCow redCow = new RedCowFarm.RedCow(180,229,6000); //Static 内部类创建对象
        redCow.speak();
    }
}
