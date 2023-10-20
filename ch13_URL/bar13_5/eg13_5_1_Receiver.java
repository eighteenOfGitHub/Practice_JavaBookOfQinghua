package bar13_5;

import java.net.*;

public class eg13_5_1_Receiver {
    public static void main(String[] args) {
        int port = 5858;                //组播的端口
        InetAddress group = null;       //组播组的端口
        MulticastSocket socket = null;  //多点广播套接字
        try{
            group = InetAddress.getByName("239.255.8.0");   //广播组的的地址
            socket = new MulticastSocket(port);                  //广播套接字将在port端口广播
            InetSocketAddress socketAddress = new InetSocketAddress(group,port);
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(group);
            socket.joinGroup(socketAddress,networkInterface);   //加入group
        }
        catch(Exception e){}
        while(true){
            byte data[] = new byte[8192];
            DatagramPacket packet = null;
            packet = new DatagramPacket(data,data.length,group,port);   //待接收的数据包
            try{
                socket.receive(packet);
                String message = new String(packet.getData(),0,packet.getLength());
                System.out.println("接收的内容：\n"+message);
            }
            catch(Exception e){}
        }
    }
}