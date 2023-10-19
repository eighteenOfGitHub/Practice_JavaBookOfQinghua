//8.1.3 String 类的常用方法
//      对象.compareTo(String s);

package bar8_1;

import java.util.*;
public class eg8_1_2 {
    public static void main(String[] args) {
        String[] a = {"lemon","apple","pear","banana"};
        String[] b = {"西瓜","苹果","梨","香蕉"};
        System.out.println("使用 SortString 类的方法按字典排序数组a：");
        SortString.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        System.out.println("使用类库中的 Arrays 类，按字典序列排列数组b：");
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
}
