package bar10_16;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RunDialog extends JDialog {
    JTextArea showOut;
    RunDialog(){
        setTitle("运行对话框");
        showOut = new JTextArea();
        Font f = new Font("宋体",Font.BOLD,15);
        showOut.setFont(f);
        add(new JScrollPane(showOut),BorderLayout.CENTER);
        setBounds(210,10,500,300);
    }
    public void run(String name){
         try{
             Runtime ce = Runtime.getRuntime();
             Process process = ce.exec("java"+name);
             InputStream in = process.getInputStream();
             BufferedInputStream bin = new BufferedInputStream(in);
             int n;
             boolean bn = true;
             byte[] mess =new byte[100];
             while((n = bin.read(mess,0,100)) != -1){
                 String s = null;
                 s = new String(mess,0,n);
                 showOut.append(s);
                 if(s!=null)bn = false;
                 if(bn)showOut.setText("Java程序中没有使用out流输出信息");
             }
         }catch(IOException el){}
    }

}
