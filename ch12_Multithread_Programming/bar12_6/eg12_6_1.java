//12.6 协调同步的线程
//wait(),notify(),notifyAll();

package bar12_6;

public class eg12_6_1 {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei,likui;
        zhangfei = new Thread(officer);
        likui = new Thread(officer);
        zhangfei.setName("张飞");
        likui.setName("李逵");
        zhangfei.start();
        likui.start();
    }
}
