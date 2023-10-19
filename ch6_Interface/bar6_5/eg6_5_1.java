//6.5 函数接口与 Lambda 表达式

package bar6_5;

interface ShowMessage{
    void 显示商标(String s);
}
public class eg6_5_1 {
    public static void main(String[] args) {
        ShowMessage sm;                         //声明变量接口
        sm = (s) -> {                           //接口变量中存放 Lambda 表达式的值
            System.out.println("tvtvtvtv");
            System.out.println(s);
            System.out.println("tvtvtvtv");
        };
        sm.显示商标("长城牌电视机");            //接口回调 Lambda 表达式实现的接口方法
        sm = (s) -> {                           //接口变量中存放 Lambda 表达式的值
            System.out.println("pcpcpcpc");
            System.out.println(s);
            System.out.println("pcpcpcpc");
        };
        sm.显示商标("华为个人电脑");            //接口回调 Lambda 表达式实现的接口方法
    }
}
