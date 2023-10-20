package bar13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class eg13_3_2_Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        ServerThread thread;
        Socket you = null;
        while(true){
            try{
                server = new ServerSocket(2010);
            }
            catch(IOException el){
                //ServerSocket对象不能重复创建，除非更换端口号
                System.out.println("正在监听");
            }
            try{
                System.out.println("等待客服呼叫");
                you = server.accept();
                System.out.println("客户的地址："+you.getInetAddress());
            }
            catch(IOException e){
                System.out.println("正在等待客户");
            }
            if(you!=null){
                new ServerThread(you).start();  //为每个客户启动一个专门的线程
            }
        }
    }
    static class ServerThread extends Thread{
        Socket socket;
        DataOutputStream out = null;
        DataInputStream in = null;
        String s = null;
        ServerThread(Socket t){
            socket = t;
            try{
                out = new DataOutputStream(socket.getOutputStream());
                in = new DataInputStream(socket.getInputStream());
            }
            catch(IOException e){}
        }
        public void run(){
            while(true){
                try{
                    double r = in.readDouble();
                    double area = Math.PI*r*r;
                    out.writeDouble(area);
                }
                catch(IOException e){
                    System.out.println("客户离开");
                    return;
                }
            }
        }
    }
}
