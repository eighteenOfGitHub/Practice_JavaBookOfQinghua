//12.7 线程联合
//顾客来蛋糕店买蛋糕，顾客等待蛋糕师知错蛋糕

package bar12_7;

public class eg12_7_1 {
    public static void main(String[] args) {
        ThreadJoin a = new ThreadJoin();
        Thread customer = new Thread(a);
        Thread cakeMaker = new Thread(a);
        customer.setName("顾客");
        cakeMaker.setName("蛋糕师");
        a.setThread(customer,cakeMaker);
        customer.start();
    }
}
