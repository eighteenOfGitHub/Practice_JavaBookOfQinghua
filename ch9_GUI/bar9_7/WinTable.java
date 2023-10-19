//eg9_7_2

package bar9_7;

import bar9_4.SetFont;

import javax.swing.*;
import java.awt.*;

public class WinTable extends JFrame {
    JTable table;
    Object[][] a;
    Object name[] = {"姓名","英语成绩","数学成绩","总成绩"};
    JButton button;
    ButtonListener buttonListener;
    WinTable(){
        a = new Object[8][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if(j!=0){
                    a[i][j] = "0";
                }
            }
        }
        button = new JButton("计算每人总成绩");
        buttonListener = new ButtonListener();
        buttonListener.setView(this);           //将当前窗口传递给 buttonListener 组合的窗口
        table = new JTable(a,name);
        table.setRowHeight(table.getRowHeight()+10);
        button.addActionListener(buttonListener);
        add(new JScrollPane(table), BorderLayout.CENTER);
        JLabel hint = new JLabel("修改或录入数据后，需要回车确认");
        add(hint,BorderLayout.NORTH);
        add(button,BorderLayout.SOUTH);
        Font f = new Font("宋体",Font.PLAIN,22);
        SetFont.setFont(f,button,table,hint);
        setSize(800,500);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
