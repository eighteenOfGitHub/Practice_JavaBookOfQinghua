//8.1.6 String对象与字符数组、字节数组
//    getChars() 和 toCharArray()
package bar8_1;

public class eg8_1_6 {
    public static void main(String[] args) {
        char[] a,c;
        String s = "1945年8月15日是抗战胜利日";
        a = new char[4];
        s.getChars(11,15,a,0);
        System.out.println(a);
        c = "十一长假期间，学校都放假了".toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
