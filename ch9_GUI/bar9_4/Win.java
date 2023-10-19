//eg9_4_6

package bar9_4;


import javax.swing.*;
import java.awt.*;

public class Win extends JFrame {
    JTextField[] text = new JTextField[3];
    Police police;
    JButton button;
    public Win(){
        setLayout(new FlowLayout());
        Font font = new Font("宋体",Font.BOLD,36);
        police = new Police();
        police.setView(this);                   //将当前窗口传递给 police 组合的窗口
        for (int i = 0; i < 3; i++) {
            text[i] = new JTextField(20);
            text[i].addKeyListener(police);     //监视键盘事件
            text[i].addFocusListener(police);   //监视焦点事件
            add(text[i]);
            text[i].setFont(font);
        }
        button = new JButton("确定");
        button.addFocusListener(police);        //监视焦点事件
        button.setFont(font);
        add(button);
        setVisible(true);                       //窗体可见
        //窗体可见之后，让 text[0] 首先输入焦点
        text[0].requestFocusInWindow();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
