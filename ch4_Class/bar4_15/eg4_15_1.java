//4_15 对象数组

package bar4_15;

class Student{
    int number;
}
public class eg4_15_1 {
    public static void main(String[] args) {
        Student stu[] = new Student[10];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = 101 + i;
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].number);
        }
    }
}
