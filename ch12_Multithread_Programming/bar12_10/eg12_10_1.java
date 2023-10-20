package bar12_10;

public class eg12_10_1 {
    public static void main(String[] args) {
        Daemon a = new Daemon();
        a.A.start();
        a.B.setDaemon(true);
        a.B.start();
    }
}
