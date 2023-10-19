//6.6.1 理解接口 机动车类特殊功能用接口实现
package bar6_6;

import com.sun.tools.javac.Main;

abstract class MotorVehicles{
    abstract void brake();
}
interface MoneyFare{
    void charge();
}

interface ControlTemperature{
    void controlAirTemperature();
}

class Bus extends MotorVehicles implements MoneyFare{
    void brake(){
        System.out.println("公共汽车使用毂式刹车技术");
    }
    public void charge(){
        System.out.println("公共汽车：一元/张，不计算公里数");
    }
}

class Taxi extends MotorVehicles implements MoneyFare,ControlTemperature{
    void brake(){
        System.out.println("出租车使用盘式刹车技术");
    }
    public void charge(){
        System.out.println("出租车：2元/公里，起价 3 公里");
    }
    public void controlAirTemperature(){
        System.out.println("出租车安装了 Hair 空调");
    }
}

class Cinema implements MoneyFare, ControlTemperature{
    public void charge(){
        System.out.println("电影院：门票，十元/张");
    }
    public void controlAirTemperature(){
        System.out.println("电影院安装了中央空调");
    }
}
public class eg6_6_1 {
    public static void main(String[] args) {
        Bus bus101 = new Bus();                 //对象
        Taxi blueTaxi = new Taxi();             //对象
        Cinema redStarCinema = new Cinema();    //对象
        MoneyFare fare;                         //接口
        ControlTemperature temperature;         //接口

        fare = bus101;
        bus101.brake();
        fare.charge();

        fare = blueTaxi;
        temperature = blueTaxi;
        blueTaxi.brake();
        fare.charge();
        temperature.controlAirTemperature();

        fare = redStarCinema;
        temperature = redStarCinema;
        temperature.controlAirTemperature();
        fare.charge();
        temperature.controlAirTemperature();
    }
}
