//8.7.3 日期格式化

package bar8_7;

import java.time.LocalDateTime;
import java.util.Locale;

public class eg8_7_3 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        String pattern = "%ty-%<tm-%<td,%<tA,%<tT";
        String s = String.format(pattern,nowTime);
        System.out.println(s);
        s = String.format(Locale.US,pattern,nowTime);
        System.out.println(s);
        s = String.format(Locale.JAPAN,pattern,nowTime);
        System.out.println(s);
    }
}
