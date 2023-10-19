//10.6 随机流
//可读写

package bar10_6;

import java.io.IOException;
import java.io.RandomAccessFile;

public class eg10_6_1 {
    public static void main(String[] args) {
        RandomAccessFile inAndOut = null;
        int data[] = {1,2,3,4,5,6,7,8,9,10};
        try{
            inAndOut = new RandomAccessFile("eg10_6_1测试.dat","rw");
            for (int i = 0; i < data.length; i++) {
                inAndOut.writeInt(data[i]);
            }
            for (long i = data.length - 1; i >= 0; i--) {
                //一个int型占4字节，inAndOut从文件的第36字节读取最后面一盒数
                inAndOut.seek(i*4);
                System.out.printf("\t%d",inAndOut.readInt());   //每隔4字节往前读取一个整数
            }
            inAndOut.close();
        }catch (IOException e){}
    }
}
