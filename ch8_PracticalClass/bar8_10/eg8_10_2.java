//8.10.3 Console类

package bar8_10;

import java.io.Console;

public class eg8_10_2 {
    public static void main(String[] args) {
        boolean success = false;
        int count = 0;
        Console cons;
        char[] passwd;
        cons = System.console();
        while(true){
            System.out.print("请输入密码：");
            passwd = cons.readPassword();
            count++;
            String password = new String(passwd);
            if(password.equals("I love this game")){
                success = true;
                System.out.println("第"+count+"次密码正确！");
                break;
            }
            else{
                System.out.println("第"+count+"次密码"+password+"不正确");
            }
            if(count == 3){
                System.out.println("您"+count+"次输入的密码都不正确");
                System.exit(0);
            }
        }
        if(success){
            System.out.println("你好，欢迎您！");
        }

    }
}
