package bar13_4;

import java.util.Scanner;

public class eg13_4_1_LiSi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SendDataPacket sendDataPacket = new SendDataPacket();   //发送数据包
        sendDataPacket.setIP("127.0.0.1");
        sendDataPacket.setPort(888);
        ReceiveDatagramPacket receiveDatagramPacket = new ReceiveDatagramPacket();
        receiveDatagramPacket.setPort(666);
        receiveDatagramPacket.receiveMess();
        System.out.println("输入发送给张三的消息：");
        while (scanner.hasNext()){
            String mess = scanner.nextLine();
            if(mess.length() == 0) 
                System.exit(0);
            byte buffer[] = mess.getBytes();
            sendDataPacket.sendMess(buffer);
            System.out.print("继续输入发送给张三的信息：");
        }
    }
}
