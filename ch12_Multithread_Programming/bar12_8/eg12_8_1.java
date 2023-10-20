//12.8 GUI线程
//训练用户在键盘上快速找到字母

/*
回车键触发ActionEvent事件，JVM中断giveLetter线程，
把CPU的使用权切换给AWT—EventQuecue线程，以便处理ActionEvent事件
*/

package bar12_8;

public class eg12_8_1 {
    public static void main(String[] args) {
        WindowTyped win = new WindowTyped();
        win.setTitle("打字游戏");
        win.setSleepTime(3000);
    }
}
