package bar13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class eg13_3_1_Server {
    public static void main(String[] args) {
        String[] answer = {"峰顶岩石面海拔8844.43米","48个","青海省"};
        ServerSocket serverForClient = null;
        Socket socketOnServer = null;
        DataOutputStream out= null;
        DataInputStream in = null;
        try{
            serverForClient = new ServerSocket(2010);
        }
        catch(IOException el){
            //如果端口号已被占用，将触发异常
            System.out.println(el);
        }
        try{
            System.out.println("等待客户呼叫");
            socketOnServer = serverForClient.accept();  //堵塞状态
            System.out.println("客户的地址："+socketOnServer.getInetAddress());
            System.out.println("客户的端口："+socketOnServer.getPort());
            out = new DataOutputStream(socketOnServer.getOutputStream());
            in = new DataInputStream(socketOnServer.getInputStream());
            for (int i = 0; i < answer.length; i++) {
                String s = in.readUTF();    //in读取信息,堵塞状态
                System.out.println("服务器收到客户的提问："+s);
                out.writeUTF(answer[i]);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("客户已断开"+e);
        }
    }
}
