//eg9_4_1
package bar9_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener;            //listener是监视器
    public WindowActionEvent(){
        setLayout(new FlowLayout());
        text = new JTextField(10);
        add(text);
        listener = new ReaderListener();    //创建监视器
        text.addActionListener(listener);   //text 将 listener 注册为自己的监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
