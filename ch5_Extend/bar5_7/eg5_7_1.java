package bar5_7;

import java.sql.SQLOutput;
import java.util.zip.CheckedOutputStream;

class 类人猿{
    void crySpeak(String s){
        System.out.println(s);
    }
}

class People extends 类人猿{
    void computer(int a, int b){
        int c = a * b;
        System.out.println(c);
    }
    void crySpeak(String s){
        System.out.println("***" + s + "***");
    }
}
public class eg5_7_1 {
    public static void main(String[] args) {
        类人猿 monkey;
        People geng = new People();
        System.out.println(geng instanceof People);
        monkey = geng;
        System.out.println(geng instanceof People);
        monkey.crySpeak("I love this game");
        People people =(People) monkey;
        people.computer(10,10);
    }
}
