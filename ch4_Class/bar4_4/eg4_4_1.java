package bar4_4;

//引用类型参数的传值
public class eg4_4_1 {
    public static void main(String[] args) {
        Bettery nanfu = new Bettery(100);
        System.out.println("南孚电池的储电量是：" + nanfu.electricityAmount);
        Radio radio = new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu);
        System.out.println("目前南孚电池的储电量是" + nanfu.electricityAmount);
    }
}
