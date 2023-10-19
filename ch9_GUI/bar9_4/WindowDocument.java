//eg9_4_4

package bar9_4;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class WindowDocument extends JFrame {
    JTextArea inputText,showText;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemCopy,itemCut,itemPaste;
    TextListener textChangeListener;       //inputText 的监视器
    HandleListener handleListener;          //itemCopy,itemCut,itemPaste 的监视器
    WindowDocument(){
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        inputText = new JTextArea(10,28);
        showText = new JTextArea(10,28);
        showText.setLineWrap(true);                 //文本自动回行
        showText.setWrapStyleWord(true);            //文本区以单词为界自动换行
        Font font = new Font("宋体",Font.PLAIN,25);
        inputText.setFont(font);
        showText.setFont(font);

        menubar = new JMenuBar();
        menu = new JMenu("编辑");
        itemCopy = new JMenuItem("复制(C)");
        itemCut = new JMenuItem("剪切(T)");
        itemPaste = new JMenuItem("粘贴(P)");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));       //设置快捷方式
        itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
        itemCopy.setActionCommand("copy");
        itemCut.setActionCommand("cut");
        itemPaste.setActionCommand("paste");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menubar.add(menu);
        setJMenuBar(menubar);

        add(new JScrollPane(inputText));
        add(new JScrollPane(showText));
        textChangeListener = new TextListener();
        handleListener = new HandleListener();
        textChangeListener.setView(this);          //将当前窗口传递给指示器组合的窗口
        handleListener.setView(this);               //将当前窗口传递给显示器组合的窗口
        Document document = inputText.getDocument();
        document.addDocumentListener(textChangeListener);       //向文本注册监视器
        itemCopy.addActionListener(handleListener);             //向菜单项注册监视器
        itemCut.addActionListener(handleListener);              //向菜单项注册监视器
        itemPaste.addActionListener(handleListener);            //向菜单项注册监视器
    }
}
