package bar4_14;

import java.util.Date;

public class Tom {
    void f(double m){
        var width = 108;            //推断为 int型
        var height = m;             //推断为 double型
        var date = new Date();      //推断为 Date型
        //width = 3.14;             //非法，已确定为 int型
        //var str;                  //非法，没有显示指定初值，无法判断 str 的类型
        //var what = null;          //非法，无法判断类型
        System.out.printf("%d,%f,%s\n",width,height,date);
    }
}
