//9.4.8 WindowEvent 事件
//使用适配器 WindowAdapter 适配器做监视器，只处理窗口关闭触发的 WindowEvent 事件，只需重写 windowClosing()

package bar9_4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends JFrame{
    Boy police;
    MyFrame(String s){
        super(s);
        police = new Boy();
        setBounds(100,100,200,300);
        setVisible(true);
        addWindowListener(police);  //向窗口注册监视器
        validate();
    }
}

class Boy extends WindowAdapter {
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

public class eg9_4_7 {
    public static void main(String[] args) {
        new MyFrame("窗口");
    }
}