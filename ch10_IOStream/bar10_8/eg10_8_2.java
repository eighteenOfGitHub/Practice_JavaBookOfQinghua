//10.8 数据流
//字符串加密后写入文件，后读取文件解密

package bar10_8;

import java.io.*;

public class eg10_8_2 {
    public static void main(String[] args) {
        String command = "杜江总攻时间是4月22日晚10点";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        String password = "Tiger";
        String secret = person.encrypt(command,password);   //加密
        File file = new File("eg10_8_2_secret.text");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeUTF(secret);
            System.out.println("加密命令："+secret);
        }catch(IOException e){}
        try{
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            String str = inData.readUTF();
            String mingwen = person.decrypt(str,password);  //解密
        }catch(IOException e){}
    }
}
