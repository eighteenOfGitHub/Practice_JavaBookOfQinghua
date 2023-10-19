//eg9_6_5

package bar9_6;

import bar9_4.SetFont;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class MyWindow extends JFrame {
    JButton button;
    JTextArea showRedBall;      //存放红球号码
    int[] redNumber;
    MyWindow(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
        button = new JButton("得到双色球彩票的一组红球");
        showRedBall = new JTextArea();
        showRedBall.setForeground(Color.red);
        add(button,BorderLayout.NORTH);
        add(new JScrollPane(showRedBall),BorderLayout.CENTER);
        button.addActionListener((e)->{
            redNumber = MyDialog.showRandomArrayDiolog
                    (this,"红色号码","双色球对话框",MyDialog.YES_NO_OPTION,33,6);
            if(redNumber != null){
                Arrays.sort(redNumber);
                showRedBall.append(Arrays.toString(redNumber)+"\n");
            }
        });
        Font f = new Font("",Font.BOLD,28);
        SetFont.setFont(f,button,showRedBall);
    }
}
