//9.4.3 MouseEvent事件
//按钮，文本框，窗口上的鼠标事件

/*
使用到的类:

WindowMouse
MousePolice
*/

package bar9_4;

public class eg9_4_5 {
    public static void main(String[] args) {
        WindowMouse win = new WindowMouse();
        win.setTitle("处理鼠标事件");
        win.setBounds(10,10,460,360);
    }
}
