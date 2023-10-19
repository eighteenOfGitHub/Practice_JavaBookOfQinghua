package bar4_7;
//设置类变量（静态变量），区别实例变量
public class eg4_7_1 {
    public static void main(String[] args) {
        Ladder.down = 100;  //Ladder 的字节码被加载到内存，通过类名操作类变量
        Ladder ladderOne = new Ladder();
        Ladder ladderTwo = new Ladder();
        ladderOne.setUp(28);
        ladderTwo.setUp(66);
        System.out.println("ladderOne 的上底：" + ladderOne.getUp());
        System.out.println("ladderOne 的下底：" + ladderOne.getDown());
        System.out.println("ladderTwo 的上底：" + ladderTwo.getUp());
        System.out.println("ladderTwo 的下底：" + ladderTwo.getDown());



    }
}
