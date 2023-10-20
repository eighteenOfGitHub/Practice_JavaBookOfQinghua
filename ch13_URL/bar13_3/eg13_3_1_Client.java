//13.3 套接字
//13.3.3 ServerSocket对象与服务器端套接字
//客户端与服务端对话:客户端

package bar13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class eg13_3_1_Client {
    public static void main(String[] args) {
        String[] mess = {"珠穆朗玛峰的高度是多少？","亚洲有多少个国家？","西宁是哪个省的省会？"};
        Socket mysocket;
        DataInputStream in = null;
        DataOutputStream out = null;
        try{
            mysocket = new Socket("127.0.0.1",2010);
            in = new DataInputStream(mysocket.getInputStream());
            out = new DataOutputStream(mysocket.getOutputStream());
            for (int i = 0; i < mess.length; i++) {
                out.writeUTF(mess[i]);
                String s = in.readUTF();        //in读取信息，堵塞状态
                System.out.println("客户收到服务器的回答："+s);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("服务器已断开"+e);
        }
    }
}
