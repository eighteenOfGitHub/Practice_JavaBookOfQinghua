//12.4 线程常用的方法
//测试：给未死亡的线程重新分配实体，垃圾实体并未结束

package bar12_4;

public class eg12_4_1 {
    public static void main(String[] args) {
        Target target = new Target();
        Thread thread = new Thread(target);
        thread.start();
        thread = new Thread(target);
        thread.start();
    }
}
