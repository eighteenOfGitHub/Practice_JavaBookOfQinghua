//10.1.1 文件的属性
//获得文件的相关信息

package bar10_1;

import java.io.File;
import java.io.IOException;

public class eg10_1_1 {
    public static void main(String[] args) {
        File f = new File("ch10_IOStream\\src\\bar10_1\\eg10_1_1.java");
        System.out.println(f.getName()+"是可读的吗："+f.canRead());
        System.out.println(f.getName()+"的长度："+f.length());
        System.out.println(f.getName()+"的绝对路径："+f.getAbsolutePath());
        File file = new File("new_eg10_1_2_测试.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("在当前目录（运行程序的目录）下创建了新文件："+file.getName());
            }catch(IOException exp){}
        }
    }
}
