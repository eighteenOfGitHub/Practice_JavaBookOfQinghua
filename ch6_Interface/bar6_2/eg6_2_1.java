//6.2 实现接口

package bar6_2;

public class eg6_2_1 {
    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println("接口中的常量" + AAA.MAX);
        System.out.println("调用 on 方法（重写的）：");
        a.on();
        System.out.println("调用 sum 方法（重写的） " + a.sum(12,18));
        System.out.println("调用接口提供的 default 方法 " + a.max(12,78));
        Com.f();
    }
}
