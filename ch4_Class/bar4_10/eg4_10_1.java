//10.4.3 运行有包名的主类
//  主类编译必须要到包名的上一级目录进行编译

package bar4_10;

public class eg4_10_1 {
    public static void main(String[] args) {
        Student stu = new Student(10201);
        stu.speak();
        System.out.println("主类的包名也是bar4_10");
    }
}
