//9.4.2 Action事件
//处理文本框上触发的ActionEvent事件

/*
使用到的类:
PoliceListener
ReaderListener
WindowActionEvent

*/

package bar9_4;

public class eg9_4_1 {
    public static void main(String[] args) {
        WindowActionEvent win = new WindowActionEvent();
        win.setTitle("处理ActionEvent事件");
        win.setBounds(100,100,310,260);
    }
}
