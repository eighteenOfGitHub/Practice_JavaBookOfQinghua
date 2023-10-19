//7.3.1 try-catch语句

package bar7_3;
public class eg7_3_1 {
    public static void main(String[] args) {
        int n = 0, m = 0, t = 1000;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab89");
            t = 7777;
        } catch (NumberFormatException e) {
            System.out.println("发生异常：" + e.getMessage());
        }
        System.out.println("n = " + n + ", m = " + m + ", t = " + t);
        try {
            System.out.println("故意抛出I/O异常！");
            throw new java.io.IOException("我是故意的");
//            System.out.println("这个输出语句肯定没有机会执行，必须注释，否则编译错误");
        }catch(java.io.IOException e){
            System.out.println("发生异常：" + e.getMessage());
        }

    }
}
