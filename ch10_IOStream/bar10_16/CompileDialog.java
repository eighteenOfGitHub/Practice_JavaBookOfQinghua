//eg10_16_3

package bar10_16;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CompileDialog extends JDialog {
    JTextArea showError;
    CompileDialog(){
        setTitle("编译对话框");
        showError = new JTextArea();
        Font f = new Font("宋体", Font.BOLD,20);
        showError.setFont(f);
        add(new JScrollPane(showError),BorderLayout.CENTER);
        setBounds(10,10,500,300);
    }
    public void compile(String name){
        try{
            Runtime ce = Runtime.getRuntime();
            Process process = ce.exec("javac "+name);
            InputStream in = process.getErrorStream();
            BufferedInputStream bin = new BufferedInputStream(in);
            int n;
            boolean bn = true;
            byte[] error = new byte[100];
            while((n = bin.read(error,0,100)) != -1){
                String s = null;
                s = new String(error,0,n);
                showError.append(s);
                if(s!=null)bn=false;
            }
            if(bn)showError.append("编译正确");
        }
        catch(IOException el){}
    }

}
