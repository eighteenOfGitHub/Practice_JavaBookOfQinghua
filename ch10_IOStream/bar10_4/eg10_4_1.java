//10.4 文件字符输入和输出流
//a的内容写到b中

package bar10_4;

import java.io.*;

public class eg10_4_1 {
    public static void main(String[] args) {
        File sourceFile = new File("eg10_3_1的测试.txt");  //读取的文件
        File targetFile = new File("eg10_4_1的测试.txt");  //写入的文件
        char c[] = new char[19];                                    //char型数组
        try{
            Writer out = new FileWriter(targetFile,true);   //指向目的地的输出流
            Reader in  = new FileReader(sourceFile);                //指向源的输入流
            int n = -1;
            while((n = in.read(c)) != -1){
                out.write(c,0,n);
            }
            out.flush();        //冲洗当前缓冲区
            out.close();
        }catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
}
