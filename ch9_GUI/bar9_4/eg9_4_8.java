//9.4.9 匿名类实例、窗口或 Lambda 表达式做监视器
//猜数字小游戏

/*
* 用到的类：
*
* SetFont
* WindowGuess
* */

package bar9_4;

public class eg9_4_8 {
    public static void main(String[] args) {
        WindowGuess win = new WindowGuess();
        win.setTitle("猜数字");
        win.setBounds(10,10,460,360);
    }
}
