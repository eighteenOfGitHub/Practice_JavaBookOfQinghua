//13.1 URL类

package bar13_1;

import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

public class eg13_1_1 {
    public static void main(String[] args) {
        Scanner scanner;
        URL url;
        Thread readURL;             //负责读取资源的线程
        Look look = new Look();     //线程的目标对象
        System.out.println("输入URL资源");
        scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        try{
            url = new URL(source);
            look.setURL(url);
            readURL = new Thread(look);
            readURL.start();
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
}
