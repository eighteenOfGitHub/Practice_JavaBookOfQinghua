//9.5 使用MVC结构
//三角形Triangle类（模型） WindowTriangleView类窗口（视图） Controller类（控制器）
package bar9_5;

public class eg9_5_1 {
    public static void main(String[] args) {
        WindowTriangleView win = new WindowTriangleView();
        win.setTitle("使用MVC结构");
        win.setBounds(100,100,720,260);
    }
}
