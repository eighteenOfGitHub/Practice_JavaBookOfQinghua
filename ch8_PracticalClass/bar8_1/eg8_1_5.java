//8.1.5 对象的 String 对象表示

package bar8_1;

import java.util.Date;

public class eg8_1_5 {
    public static void main(String[] args) {
       Date date = new Date();
        System.out.println(date.toString());
        int address = System.identityHashCode(date);
        System.out.printf("date 对象的引用：%x\n",address);
        TV tv = new TV();
        tv.setPrice(5897.98);
        System.out.println(tv.toString());
        address = System.identityHashCode(tv);
        System.out.printf("tv 对象的引用：%x\n",address);
    }
}
