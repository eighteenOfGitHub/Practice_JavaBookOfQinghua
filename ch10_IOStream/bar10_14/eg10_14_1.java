//10.14 带进度条的输入流

package bar10_14;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;

public class eg10_14_1 {
    public static void main(String[] args) {
        byte[] b = new byte[30];
        try{
            FileInputStream input = new FileInputStream("eg10_14_1.java");
            ProgressMonitorInputStream in = new ProgressMonitorInputStream(null,"读取java文件",input);
            ProgressMonitor p = in.getProgressMonitor();
            while(in.read(b) != -1){
                String s = new String(b);
                System.out.print(s);
                Thread.sleep(1000); //由于文件较小，为了看清楚进度条，这里延迟1000毫秒
            }
        }
        catch(Exception e){}
    }
}
