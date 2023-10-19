package bar9_8;

import bar9_4.Police;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BindButtonWindow extends JFrame {
    JButton button;
    Police listener;
    BindButtonWindow(){
        setLayout(new FlowLayout());
        listener = new Police();
        button = new JButton("单击我或按A键移动我");
        add(button);
        button.addActionListener(listener); //listener以注册方式成为监视器，监视鼠标单击按钮
        InputMap inputMap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke("A"),"dog");
        ActionMap actionmap = button.getActionMap();
        actionmap.put("dog",listener);      //指定listener是按钮键盘操作的监视器
        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class Police extends AbstractAction{    //Police是内部类
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            int x = b.getBounds().x;        //获得按钮的位置
            int y = b.getBounds().y;
            b.setLocation(x+10,y+10);   //移动按钮
        }
    }
}
