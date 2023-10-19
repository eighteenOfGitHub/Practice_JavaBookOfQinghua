//eg9_4_3

package bar9_4;

import javax.swing.*;
import java.awt.*;
import java.lang.management.OperatingSystemMXBean;

public class NumberView extends JFrame {
    public JTextField inputNumberOne,inputNumberTwo;
    public JComboBox<String> choiceFuhao;
    public JTextArea textShow;
    public JButton button;
    public OperatorListener operator;   //监视 ItemEvent 事件的监视器
    public ComputerListener computer;   //监视 ActionEvent 事件的监视器
    public NumberView(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        Font font = new Font("宋体",Font.BOLD,22);
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        inputNumberOne.setFont(font);
        inputNumberTwo.setFont(font);
        choiceFuhao = new JComboBox<String>();
        choiceFuhao.setFont(font);
        button = new JButton("计算");
        button.setFont(font);
        choiceFuhao.addItem("选择运算符号：");
        String []a = {"+","-","*","/"};
        for (int i = 0; i < a.length; i++) {
            choiceFuhao.addItem(a[i]);
        }
        choiceFuhao.setSelectedIndex(-1);       //初始状态列表中没有被选中
        textShow = new JTextArea(9,30);
        textShow.setFont(font);
        operator = new OperatorListener();
        computer = new ComputerListener();
        operator.setView(this);                 //将当前窗口传递给 operator 组合的窗口
        computer.setView(this);                 //将当前窗口传递给 operator 组合的窗口
        choiceFuhao.addItemListener(operator);  //operator 是监视器
        choiceFuhao.addActionListener(operator);//operator 是监视器
        button.addActionListener(computer);     //computer 是监视器
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}
