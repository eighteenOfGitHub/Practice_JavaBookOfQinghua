package bar8_7;

import java.time.LocalDate;

public class GiveCalendar {
    public LocalDate[] getCalendar(LocalDate date){
        date = date.withDayOfMonth(1);  //确保 data 日期的 day 是 1，即 day 的值是 1
        int days = date.lengthOfMonth(); //得到该月有几天
        LocalDate dataArrays[] = new LocalDate[days];
        for (int i = 0; i < days; i++) {
            dataArrays[i] =  date.plusDays(i);
        }
        return dataArrays;
    }
}
