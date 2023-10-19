//6.4 接口回调

package bar6_4;

interface ShowMessage{
    void 显示商标(String s);
    default void outPutStart(){
        System.out.println("*******");
    }
}

class TV implements ShowMessage{
    public void 显示商标(String s){
        System.out.println("tvtvtvtv");
        System.out.println(s);
        System.out.println("tvtvtvtv");
        }
}

class PC implements ShowMessage{
    public void 显示商标(String s){
        System.out.println("pcpcpcpc");
        System.out.println(s);
        System.out.println("pcpcpcpc");
    }
}
public class eg6_4_1 {
    public static void main(String[] args) {
        ShowMessage sm;                 //声明接口变量
        sm = new TV();                  //接口变量中存放对象的引用
        sm.显示商标("长城牌电视机");    //接口回调
        sm = new PC();                  //接口变量中存放对象的引用
        sm.outPutStart();
        sm.显示商标("华为个人电脑");    //接口回调
        sm.outPutStart();
    }
}
