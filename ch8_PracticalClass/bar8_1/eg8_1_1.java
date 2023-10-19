//8.1.3 String 类的常用方法
//      对象1.equals(对象2);
package bar8_1;

public class eg8_1_1 {
    public static void main(String[] args) {
        String s1,s2;
        s1 = new String("天道酬勤");
        s2 = new String("天道酬勤");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("两者实体相同吗：" + s1.equals(s2)); //true
        int addressS1 = System.identityHashCode(s1);
        int addressS2 = System.identityHashCode(s2);
        System.out.printf("String 对象 s1 和 s2 的引用分别为%x,%x\n",addressS1,addressS2);
        System.out.printf("两者的引用相同吗：%b\n",s1 == s2);    //false
        String s3,s4;
        s3 = "we are students";
        s4 = new String("we are students");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("两者实体相同吗：" + s3.equals(s4)); //true

        int addressS3 = System.identityHashCode(s3);
        int addressS4 = System.identityHashCode(s4);
        System.out.printf("String 对象 s3 和 s4 的引用分别为%x,%x\n",addressS3,addressS4);
        System.out.printf("两者的引用相同吗：%b\n",s3 == s4);    //false

        String s5,s6;
        s5 = "勇者无敌";
        s6 = "勇者无敌";
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("两者实体相同吗：" + s5.equals(s6)); //true
        int addressS5 = System.identityHashCode(s5);
        int addressS6 = System.identityHashCode(s6);
        System.out.printf("String 对象 s5 和 s6 的引用分别为%x,%x\n",addressS5,addressS6);
        System.out.printf("两者的引用相同吗：%b\n",s5 == s6);    //false
    }
}
