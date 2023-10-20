package bar13_4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDatagramPacket implements Runnable{
    Thread thread;
    public int port;        //接收信息的端口
    public ReceiveDatagramPacket(){
        thread = new Thread(this);
    }
    public void setPort(int port){
        this.port = port;
    }
    public void receiveMess(){
        thread.start();
    }
    public void run(){
        DatagramPacket pack = null;
        DatagramSocket datagramSocket = null;
        byte data[] = new byte[8192];
        try{
            pack = new DatagramPacket(data,data.length);
            datagramSocket = new DatagramSocket(port);
        }
        catch(Exception e){}
        if(datagramSocket == null)return ;
        while(true){
            try{
                datagramSocket.receive(pack);
                String message = new String(pack.getData(),0,pack.getLength());
                System.out.printf("%25s\n","收到："+message);
            }
            catch(Exception e){}
        }
    }
}
