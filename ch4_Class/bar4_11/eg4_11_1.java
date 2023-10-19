//4.11.1 引用类库中的类
//  用 Date类 显示本地时间
//  用 Arrays类 .sort() .toString()

package bar4_11;

import java.util.Arrays;
import java.util.Date;

public class eg4_11_1 {
    public static void main(String[] args) {
        Date date = new Date();
        //java.util.Date date = new java.util.Date();
        System.out.println("本机机器的时间： " + date.toString());
        int[] a = {12,34,-34,2,100};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
