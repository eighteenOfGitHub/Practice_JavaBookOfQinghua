//8.2.3 字符序列的替换

package bar8_2;

public class eg8_2_2 {
    public static void main(String[] args) {
        String str = "培训学校的E-mail:qinghua@sina.com.cn或zhang@163.com";
        String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
        System.out.println("清除\n"+str+"\n中的E-mail地址");
        str = str.replaceAll(regex,"");
        System.out.println(str);
        String money = "89,235,678元";
        System.out.print(money + " 转换成数字：");
        String s = money.replaceAll("[,元]","");   //
        long number = Long.parseLong(s);
        System.out.println(number);
    }
}
