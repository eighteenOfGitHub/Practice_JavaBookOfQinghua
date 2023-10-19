//10.8 数据流
//写几个java类型的数据到一个文件再读出来

package bar10_8;

import java.io.*;

public class eg10_8_1 {
    public static void main(String[] args) {
        File file = new File("eg10_8_1测试.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeInt(100);
            outData.writeLong(123456);
            outData.writeFloat(3.1415926f);
            outData.writeBoolean(true);
            outData.writeChars("How are you doing");
        }catch(IOException e){}
        try{
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            System.out.println(inData.readInt());       //读取 int 型数据
            System.out.println(inData.readLong());       //读取 long 型数据
            System.out.println(+inData.readFloat());       //读取 float 型数据
            System.out.println(inData.readDouble());       //读取 double 型数据
            System.out.println(inData.readBoolean());       //读取 boolean 型数据
            char c ='\0';
            while((c = inData.readChar()) != '\0'){
                System.out.print(c);
            }
        }catch (IOException e){}
    }
}
