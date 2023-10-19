//9.4.2 Action事件
//利用组合让一个对象操作另一个对象

/*
使用到的类:

PoliceListener
WindowView
*/

package bar9_4;

public class eg9_4_2 {
    public static void main(String[] args) {
        WindowView win = new WindowView();
        win.setBounds(100,100,600,460);
        win.setTitle("处理ActionEvent事件");
    }
}
