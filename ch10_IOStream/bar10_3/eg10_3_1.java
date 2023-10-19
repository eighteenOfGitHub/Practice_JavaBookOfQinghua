//10.3 文件字节输出流
//向a.txt写文件，尾加内容

package bar10_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class eg10_3_1 {
    public static void main(String[] args) {
        byte[] a = "新年快乐".getBytes();
        byte[] b = "Happy New Year".getBytes();
        File file = new File("eg10_3_1的测试.txt");                  //输出的目的地
        try{
            OutputStream out = new FileOutputStream((file));    //指向目的地的输出流
            System.out.println(file.getName()+"的大小："+file.length()+"字节");   //a.txt的大小：0字节
            out.write(a);
            out.close();
            out = new FileOutputStream(file,true);      //准备向文件尾加内容
            System.out.println(file.getName()+"的大小："+file.length()+"字节");   //a.txt的大小：8字节
            out.write(b,0,b.length);
            System.out.println(file.getName()+"的大小："+file.length()+"字节");   //a.txt的大小：22字节
        }catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
}
