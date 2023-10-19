//10.1.4 运行可执行文件
//打开记事本

package bar10_1;

import java.io.File;

public class eg10_1_3 {
    public static void main(String[] args) {
        try{
            Runtime ce = Runtime.getRuntime();
            File file = new File("Notepad.exe");
            ce.exec(file.getName());
            file = new File("C:/Program Files/Microsoft Office/root/Office16/Excel.exe");
            ce.exec(file.getAbsolutePath());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
