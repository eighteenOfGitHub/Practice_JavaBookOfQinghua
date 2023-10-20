package bar13_4;

import java.util.Scanner;

public class eg13_4_1_ZhangSan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SendDataPacket sendDataPacket = new SendDataPacket();   //发送数据包
        sendDataPacket.setIP("127.0.0.1");
        sendDataPacket.setPort(666);
        ReceiveDatagramPacket receiveDatagramPacket = new ReceiveDatagramPacket();
        receiveDatagramPacket.setPort(888);
        receiveDatagramPacket.receiveMess();    //负责接收数据包
        System.out.print("输入发送给李四的消息：");
        while (scanner.hasNext()){
            String mess = scanner.nextLine();
            if(mess.length() == 0){
                System.exit(0);
            }
            byte buffer[] = mess.getBytes();
            sendDataPacket.sendMess(buffer);
            System.out.print("继续输入发送给李四的消息：");
        }
    }
}
