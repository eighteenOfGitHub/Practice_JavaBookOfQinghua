//5.4.2 方法重写
//  重写方法的类型可以是父类方法类型的子类
package bar5_4;
class A{
    Object get(){
        return null;
    }
}

class B extends A{
    Integer get() {
    return new Integer(100);
    }
}
public class eg5_4_1 {
    public static void main(String[] args) {
        B b = new B();
        Integer t = b.get();
        System.out.println(t.intValue());
    }
}
