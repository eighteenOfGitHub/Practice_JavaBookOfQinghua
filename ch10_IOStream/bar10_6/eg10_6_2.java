//10.6 随机流
//RandomAccessFile流使用readLine()读取文件

package bar10_6;

import java.io.IOException;
import java.io.RandomAccessFile;

public class eg10_6_2 {
    public static void main(String[] args) {
        RandomAccessFile in = null;
        try{
            in = new RandomAccessFile("eg10_6_1测试.dat","rw");
            long length = in.length();      //获取文件的长度
            long position = 0;
            in.seek(position);              //将读取位置定位到文件的起始
            while(position < length){
                String str = in.readLine();
                byte b[] = str.getBytes("iso-8859-1");
                str = new String(b);
                position = in.getFilePointer();
                System.out.println(str);
            }
        }catch(IOException e){}
    }
}
