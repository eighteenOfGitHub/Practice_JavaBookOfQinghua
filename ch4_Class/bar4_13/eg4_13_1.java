//4_13 基本类型的类封装
//字符大小写判断  Character.isUpperCase()
//              Character.isLowerCase()
//字符大小写转换  Character.toUpperCase()
//              Character.toLowerCase()

package bar4_13;

public class eg4_13_1 {
    public static void main(String[] args) {
        char[] a = {'a','b','c','D','E','F'};
        for (int i = 0; i <a.length ; i++) {
            if(Character.isLowerCase(a[i])) {
                a[i] = Character.toUpperCase(a[i]);
            } else if (Character.isUpperCase(a[i])) {
                a[i] = Character.toLowerCase(a[i]);
            }
        }
//      fori
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
//      iter
        for (char c : a) {
            System.out.print(" " + c);
        }
    }
}
