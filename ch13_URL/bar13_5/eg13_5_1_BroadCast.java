package bar13_5;

import java.net.*;

public class eg13_5_1_BroadCast {
    String s = "国庆放假时间是9月30日";
    int port = 5858;                    //组播的端口
    InetAddress group = null;           //组播组的地址
    MulticastSocket socket = null;      //多点广播套接字
    eg13_5_1_BroadCast(){
        try{
            group = InetAddress.getByName("239.255.8.0");   //广播组的地址
            socket = new MulticastSocket(port);                  //广播套接字将在port端口广播
            socket.setTimeToLive(1);                 //多点广播套接字发送数据包范围为本地网络
            InetSocketAddress socketAddress = new InetSocketAddress(group,port);
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(group);
            socket.joinGroup(socketAddress,networkInterface);     //加入group
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
    public void play(){
        while(true){
            try{
                DatagramPacket packet = null;
                byte data[] = s.getBytes();
                packet = new DatagramPacket(data,data.length,group,port);
                System.out.println(new String(data));
                socket.send(packet);
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Error:"+e);
            }
        }
    }
    public static void main(String[] args) {
        new eg13_5_1_BroadCast().play();
    }
}
