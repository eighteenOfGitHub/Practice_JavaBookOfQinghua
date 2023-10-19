//8.7.1 日期与时间类

package bar8_7;

import java.time.*;

public class eg8_7_1 {
    public static void main(String[] args) {
        LocalDate dateOne = LocalDate.now();
        System.out.println("本地时间："+dateOne);
        LocalDate dateTwo = LocalDate.of(2025,1,22);
        System.out.println("自定时间："+dateTwo);
        System.out.println(dateOne+"在"+dateTwo+"之后"+dateOne.isAfter(dateTwo));
        int year = 18,month = 23,day = 8976;
        LocalDate dateAge = dateOne.plusYears(-year);
        System.out.println(dateOne+" "+year+"年前是：\n"+dateAge);
        System.out.println("那天是"+dateAge. getDayOfWeek());
        LocalDate dateAfter = dateTwo.plusYears(year).plusMonths(month).plusDays(8976);
        System.out.println(dateTwo+"再过"+year+"年"+month+"个月"+day+"天之后是："+dateAfter);
        System.out.println("那天是"+dateAfter.getDayOfWeek());
        int second = 1897;
        LocalTime time = LocalTime.of(23,30,1);
        LocalTime nextTime = time.plusSeconds(second);
        System.out.println(time+"再过"+second+"秒是"+nextTime);
    }
}
