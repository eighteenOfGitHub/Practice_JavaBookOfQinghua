//9.6.1 消息对话框
//只能输入英文，输入非英文弹出消息对话框
/*
用到的类

WindowMess
*/
package bar9_6;

public class eg9_6_1 {
    public static void main(String[] args) {
        WindowMess win = new WindowMess();
        win.setTitle("带消息对话框的窗口");
        win.setBounds(80,90,350,300);
    }
}
