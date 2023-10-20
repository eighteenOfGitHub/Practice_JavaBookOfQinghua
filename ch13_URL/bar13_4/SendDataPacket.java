package bar13_4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDataPacket {
    public byte messBySend[];       //存放要发送的数据
    public String IP;               //目标IP地址
    public int port;                //目标端口
    public void setPort(int port){
        this.port = port;
    }
    public void setIP(String IP){
        this.IP = IP;
    }
    public void sendMess(byte messBySend[]){
        try{
            InetAddress address = InetAddress.getByName(IP);
            DatagramPacket dataPack = new DatagramPacket(messBySend,messBySend.length,address,port);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(dataPack);
        }
        catch(Exception e){}
    }
}
