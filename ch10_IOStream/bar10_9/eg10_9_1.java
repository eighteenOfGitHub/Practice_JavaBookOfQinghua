//10.9 对象流
//使用对象流读写TV类创建的对象

package bar10_9;

import java.io.*;

public class eg10_9_1 {
    public static void main(String[] args) {
        TV changhong = new TV();
        changhong.setName("长虹电视");
        changhong.setPrice(5678);
        File file = new File("eg10_9_1_television.txt");
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(changhong);
            objectOut.close();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            TV xinfei = (TV)objectIn.readObject();
            objectIn.close();
            xinfei.setName("新飞电视");
            xinfei.setPrice(6666);
            System.out.println("changhong的名字："+changhong.getName());
            System.out.println("changhong的价格："+changhong.getPrice());
            System.out.println("xinfei的名字："+xinfei.getName());
            System.out.println("xinfei的名字："+xinfei.getPrice());
        }
        catch (ClassNotFoundException event){
            System.out.println("不能读出对象");
        }
        catch(IOException event){
            System.out.println(event);
        }
    }
}
