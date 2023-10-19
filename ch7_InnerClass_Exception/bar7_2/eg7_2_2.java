//7.2.2 和接口有关的匿名类

package bar7_2;

interface SpeakHello{
    void speak();
}

class HelloMachine{
    public void turnOn(SpeakHello hello){
        hello.speak();
    }
}
public class eg7_2_2 {
    public static void main(String[] args) {
        HelloMachine machine = new HelloMachine();
        machine.turnOn(new SpeakHello(){
            @Override
            public void speak(){
            System.out.println("hello,you are welcome!");
        }
        });
        machine.turnOn(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("你好，欢迎光临");
            }
        });
    }
}
