//5_12 应用举例 SIM卡

package bar5_12;

public class eg5_12_1Application {
    public static void main(String[] args) {
        MobileTelephone telephone = new MobileTelephone();
        SIM sim = new SIMOfChinaMobile();
        sim.setNumber("13887656432");
        telephone.useSIM(sim);
        telephone.showMess();
        sim = new SIMOfChinaUnicom();
        sim.setNumber("13097656437");
        telephone.useSIM(sim);
        telephone.showMess();
    }
}
