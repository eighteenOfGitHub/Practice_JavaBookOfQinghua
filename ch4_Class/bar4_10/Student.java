package bar4_10;

public class Student {
    int number;
    Student(int n){
        number = n;
    }
    void speak(){
        System.out.println("Student类的包名是bar4_10，我的学号是 " + number);
    }
}
