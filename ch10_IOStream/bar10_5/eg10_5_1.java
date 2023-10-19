//10.5 缓冲流
//整行读取

package bar10_5;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class eg10_5_1 {
    public static void main(String[] args) {
        File fRead = new File("eg10_5_1样本.txt");
        File fWrite= new File("eg10_5_1测试.txt");
        try{
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            while((str = bufferRead.readLine()) != null){
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str + "句子中的单词个数："+count;
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferWrite.close();
            out.close();
            in = new FileReader(fWrite);
            bufferRead = new BufferedReader(in);
            String s = null;
            System.out.println(fWrite.getName()+"内容：");
            while((s = bufferRead.readLine()) != null){
                System.out.println(s);
            }
            bufferRead.close();
            in.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
