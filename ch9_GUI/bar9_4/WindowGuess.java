package bar9_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class WindowGuess extends JFrame implements ActionListener {
    int number;                 //存放要猜测的数
    byte count;                 //用户猜测的次数
    JLabel hintLabel;
    JTextField inputGuess;
    JButton buttonGetNumber,buttonEnter;
    public WindowGuess(){
        number = (int)(Math.random()*100+1);
        setLayout(new FlowLayout());
        buttonGetNumber = new JButton("得到一个随机数(1~100)");
        add(buttonGetNumber);
        hintLabel = new JLabel("输入你的猜测：",JLabel.CENTER);
        hintLabel.setBackground(Color.cyan);
        inputGuess = new JTextField(10);
        add(hintLabel);
        add(inputGuess);
        buttonEnter = new JButton("确定");
        add(buttonEnter);
        buttonEnter.addActionListener(this);        //将当前窗口做监视器
        buttonGetNumber.addActionListener((e)->{
            number = (int)(Math.random()*100)+1;
            count = 0;
            hintLabel.setText("输入你的猜测：");
            inputGuess.setText(null);
            buttonEnter.setEnabled(true);
        });             //Lambda 表达式做监视器
        Font font = new Font("宋体",Font.PLAIN,30);
        SetFont.setFont(font,hintLabel,buttonEnter,buttonGetNumber,inputGuess);
        setBounds(100,100,150,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
    public void  actionPerformed(ActionEvent e){
        buttonGetNumber.setEnabled(false);
        int  guess = 0;
        try{
            guess = Integer.parseInt(inputGuess.getText());
            count++;
            if(guess == number){
                hintLabel.setText("猜对了（猜测次数：" + count + "）");
                buttonEnter.setEnabled(false);
                buttonGetNumber.setEnabled(true);
            } else if (guess > number) {
                hintLabel.setText("猜大了（猜测次数：" + count + "）");
            } else if (guess < number) {
                hintLabel.setText("猜小了（猜测次数：" + count + "）");
            }
        }
        catch(NumberFormatException event){
            hintLabel.setText("请输入数字符号");
        }
    }
}
