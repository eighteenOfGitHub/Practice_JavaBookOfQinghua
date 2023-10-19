//10.11 使用Scanner解析文件
//使用Scanner解析文件中的全部消费

package bar10_11;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class eg10_11_1 {
    public static void main(String[] args) {
        File file = new File("eg10_11_1_cost.txt");
        Scanner sc = null;
        int sum = 0;
        try{
            sc = new Scanner(file);
            while(sc.hasNext()){
                try{
                    int price = sc.nextInt();
                    sum = sum + price;
                    System.out.println(price);
                }
                catch(InputMismatchException exp){
                    String t = sc.next();
                }
            }
            System.out.println("Total Cost:" + sum + " dollar");
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
}
