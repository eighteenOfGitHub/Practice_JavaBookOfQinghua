//7.2.3 用 Lambdda 表达式代替匿名类

package bar7_2;

//接口与类的声明见eg7_2_2

public class eg7_2_3 {
    public static void main(String[] args) {
        HelloMachine machine = new HelloMachine();
        machine.turnOn(()->{    //向形参 hello 传递 Lambda 表达式的值
            System.out.println("hello,you are welcome!");
        });
        machine.turnOn(()->{    //向形参 hello 传递 Lambda 表达式的值
            System.out.println("你好，欢迎光临");
        });
    }
}

