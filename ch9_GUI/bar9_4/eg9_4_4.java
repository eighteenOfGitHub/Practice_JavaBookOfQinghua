//9.4.4 DocumentEvent事件
//文本区单词排序

/*
使用到的类:
TextListener
WindowDocument
HandleListener
*/
package bar9_4;

public class eg9_4_4 {
    public static void main(String[] args) {
        WindowDocument win = new WindowDocument();
        win.setBounds(100,100,890,500);
        win.setTitle("排序单词");
    }
}
