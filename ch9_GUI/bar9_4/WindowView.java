//eg9_4_2
package bar9_4;

import javax.swing.*;
import java.awt.*;

public class WindowView extends JFrame {
    public JTextField inputText;
    public JTextArea textShow;
    public JButton button;
    PoliceListener listener;
    public WindowView(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        Font font = new Font("宋体",Font.PLAIN,20);
        inputText = new JTextField(20);
        inputText.setFont(font);
        button = new JButton("确定");
        button.setFont(font);
        font = new Font("宋体",Font.BOLD,22);
        textShow = new JTextArea(9,30);
        textShow.setFont(font);

        listener = new PoliceListener();
        listener.setView(this);                     //将当前窗口传递给 listener 组合的窗口
        inputText.addActionListener(listener);      //listener 是监视器
        button.addActionListener(listener);         //listener 是监视器

        add(inputText);
        add(button);
        add(new JScrollPane(textShow));

    }
}
