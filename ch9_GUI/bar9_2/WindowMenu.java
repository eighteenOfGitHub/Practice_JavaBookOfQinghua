package bar9_2;

import javax.swing.*;

public class WindowMenu extends JFrame{
    JMenuBar menubar;   //菜单条
    JMenu menuFruit;
    JMenuItem bananaItem,pearItem;
    JMenu appleMenu;
    JMenuItem redAppleItem,yellowAppleItem;
    public WindowMenu(){}
    public WindowMenu(String s,int x,int y,int w,int h){
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init(String s){
        setTitle(s);
        menubar = new JMenuBar();
        menuFruit = new JMenu("水果菜单");  //用 menuFruit 做根菜单
        bananaItem = new JMenuItem("香蕉");
        bananaItem.setIcon(new ImageIcon("D:\\文件图片影视\\专业学习\\大一下\\Java\\练习\\Java2\\ch9_GUI\\src\\bar9_1\\banana.jpg"));
        pearItem = new JMenuItem("甜梨");
        pearItem.setIcon(new ImageIcon("D:\\文件图片影视\\专业学习\\大一下\\Java\\练习\\Java2\\ch9_GUI\\src\\bar9_1\\pear.jpg"));
        appleMenu = new JMenu("苹果");
        redAppleItem = new JMenuItem("红苹果");
        redAppleItem.setIcon(new ImageIcon("D:\\文件图片影视\\专业学习\\大一下\\Java\\练习\\Java2\\ch9_GUI\\src\\bar9_1\\redApple.jpg"));
        yellowAppleItem = new JMenuItem("黄苹果");
        yellowAppleItem.setIcon(new ImageIcon("D:\\文件图片影视\\专业学习\\大一下\\Java\\练习\\Java2\\ch9_GUI\\src\\bar9_1\\yellowApple.jpg"));
        menuFruit.add(bananaItem);      //为菜单添加菜单项
        menuFruit.add(pearItem);        //为菜单添加菜单项
        menuFruit.addSeparator();       //为菜单添加分隔线
        menuFruit.add(appleMenu);       //在菜单中添加子菜单
        appleMenu.add(redAppleItem);    //为菜单添加菜单项
        appleMenu.add(yellowAppleItem); //为菜单添加菜单项
        menubar.add(menuFruit);         //在菜单挑中添加 menuFruit 菜单
        setJMenuBar(menubar);           //在窗口中放置菜单条
    }
}
