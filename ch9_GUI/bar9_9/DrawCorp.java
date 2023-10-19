package bar9_9;

import javax.swing.*;
import java.awt.*;

public class DrawCorp extends Corp{
    public JPanel getCorpAD(){
        DrawingBoard panel = new DrawingBoard();
        return panel;
    }
    class DrawingBoard extends  JPanel{
        Toolkit tool;
        Image image1,image2;
        DrawingBoard(){
            setBackground(Color.yellow);
            tool = getToolkit();
//            image1 = tool.getImage("D:\\文件图片影视\\专业学习\\大一下\\Java\\练习\\Java2\\ch9_GUI\\src\\bar9_9\\one.png");
            image2 = tool.getImage("ch9_GUI\\src\\bar9_9\\two.png");
        }
        public void paint(Graphics g){
            super.paint(g);
            int w = getBounds().width;
            int h = getBounds().height;
//            g.drawImage(image1,0,0,w,h,this);
            g.drawImage(image2,0,0,w,h,this);

        }
    }
}
