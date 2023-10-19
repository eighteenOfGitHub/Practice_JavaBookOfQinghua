//5_5_2 使用 super 调用父类的构造方法
//  子类不继承父类的构造方法，所以用 super 调用父类的构造方法
//  且 super 必须是构造方法中的头一个语句

package bar5_5;

class Student{
    int number;
    String name;
    Student(){}
    Student(int number,String name){
        this.number = number;
        this.name = name;
        System.out.println("我的名字 " + name + " ,学号 " + number);
    }
}

class UniverStudent extends Student{
    boolean 婚否;
    UniverStudent(int number, String name, boolean b){
        super(number,name);
        婚否 = b;
        System.out.println("婚否 " + 婚否);
    }

}
public class eg5_5_1 {
    public static void main(String[] args) {
        UniverStudent zhang = new UniverStudent(9901, "何晓林", false);
    }
}
