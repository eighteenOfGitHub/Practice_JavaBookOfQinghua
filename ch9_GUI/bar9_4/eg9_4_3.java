//9.4.3 ItemEvent事件
//简单计算器

/*
使用到的类:

NumberView
ComputerListener
OperatorListener
*/

package bar9_4;

public class eg9_4_3 {
    public static void main(String[] args) {
        NumberView win = new NumberView();
        win.setBounds(100,100,600,360);
        win.setTitle("简单计算器");
    }
}
