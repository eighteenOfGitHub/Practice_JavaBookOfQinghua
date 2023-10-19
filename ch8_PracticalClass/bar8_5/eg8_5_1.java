//8.5 Pattern类 与 Matcher类

package bar8_5;

import java.util.regex.*;

public class eg8_5_1 {
    public static void main(String[] args) {
        String dataSource = "市话76.8元，长途167.38元，短信12.68元，其他20元";   //数据源
        String regex = "-?[1-9][0-9]*[.]?[0-9]*";   //匹配整数和浮点数的正则表达式
        Pattern p = Pattern.compile(regex);     //模式对象
        Matcher m = p.matcher(dataSource);      //匹配对象
        double sum = 0;
        while(m.find()){
            String item = m.group();
            System.out.println(item);
            sum = sum + Double.parseDouble(item);
        }
        System.out.println("账单总价格：" + sum);
    }
}
