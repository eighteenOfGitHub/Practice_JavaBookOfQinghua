package bar13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class eg13_3_2_Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket mysocket = null;
        DataInputStream in = null;
        DataOutputStream out = null;
        Thread readData;
        Read read = null;
        try{
            mysocket = new Socket();
            read = new Read();
            readData = new Thread(read);        //负责读取信息的线程
            System.out.print("输入服务器的IP：");
            String IP = scanner.nextLine();
            System.out.print("输入端口号：");
            int port = scanner.nextInt();
            if(mysocket.isConnected()){}
            else{
                InetAddress address = InetAddress.getByName(IP);
                InetSocketAddress socketAddress = new InetSocketAddress(address,port);
                mysocket.connect(socketAddress);
                in = new DataInputStream(mysocket.getInputStream());
                out = new DataOutputStream(mysocket.getOutputStream());
                read.setDataInputStream(in);
                readData.start();       //启动负责读取信息的
            }
        }
        catch(Exception e){
            System.out.println("服务器已断开"+e);
        }
        System.out.println("输入圆的半径（放弃请输入N）：");
        while(scanner.hasNext()){
            double radius = 0;
            try{
                radius = scanner.nextDouble();
            }
            catch(InputMismatchException exp){
                System.exit(0);
            }
            try{
                out.writeDouble(radius);        //向服务器放松信息
            }
            catch(Exception e){}
        }
    }
}
