package bar9_3;

import bar9_2.WindowMenu;

import javax.swing.*;

public class WindowBoxLayout extends JFrame {
    Box boxH;               //行型盒式容器
    Box boxVOne,boxVTwo;    //列型盒式容器
    public WindowBoxLayout(){
        setLayout(new java.awt.FlowLayout());
        Init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void Init(){
        boxH = Box.createHorizontalBox();
        boxVOne = Box.createHorizontalBox();
        boxVTwo = Box.createVerticalBox();
        boxVOne.add(new JLabel("姓名："));
        boxVOne.add(new JLabel("职业："));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVOne);
        add(boxH);

    }
}
