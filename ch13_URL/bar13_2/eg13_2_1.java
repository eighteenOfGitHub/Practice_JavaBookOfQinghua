//13.2 InetAddress类
//13.2.2 获取地址

package bar13_2;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class eg13_2_1{
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.sina.com.cn");
            System.out.println(address.toString());
            address = InetAddress.getByName("221.180.220.34");
            System.out.println(address.toString());
            address = InetAddress.getLocalHost();
            System.out.println(address.toString());
        }
        catch(UnknownHostException e){
            System.out.println("" + e);
        }
    }
}
