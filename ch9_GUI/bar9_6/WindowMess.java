//eg9_6_1

package bar9_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowMess extends JFrame implements ActionListener {
    JTextField inputEnglish;
    JTextArea show;
    String regex = "[a-zA-Z]+";
    WindowMess(){
        inputEnglish = new JTextField(22);
        inputEnglish.addActionListener(this);
        show = new JTextArea();
        show.setLineWrap(true);                 //文本自动回行
        show.setWrapStyleWord(true);            //文本区以单词为界自动换行
        add(inputEnglish, BorderLayout.NORTH);
        add(show,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == inputEnglish){
            String str = inputEnglish.getText();
            if(str.matches(regex)){
                show.append(str+",");
            }
            else{
                JOptionPane.showMessageDialog(this,"输入非法字符",
                        "消息对话框",JOptionPane.ERROR_MESSAGE);
                inputEnglish.setText(null);
            }
        }
    }
}
