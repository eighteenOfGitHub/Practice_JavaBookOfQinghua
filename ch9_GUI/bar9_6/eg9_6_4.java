//9.6.4 颜色对话框
//弹出颜色对话框，选择颜色改变窗口颜色

/*
使用到的类：
WindowColor
*/


package bar9_6;

import java.awt.*;

public class eg9_6_4 {
    public static void main(String[] args) {
        WindowColor win = new WindowColor();
        win.setTitle("带颜色对话框的窗口");
        win.setBounds(80,90,200,300);
    }
}
