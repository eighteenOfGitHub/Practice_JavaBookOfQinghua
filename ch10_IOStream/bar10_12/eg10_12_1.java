//10.12 读写图像文件
//使用ImageIO读取jpg文件，用BufferedImage绘制文字，然后保存

package bar10_12;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class eg10_12_1 {
    public static void main(String[] args) {
        File fileRead = new File("eg10_12_1_pic.jpg");          //源
        File fileWriteOne = new File("eg10_12_1_java.bmp");     //目的地
        File fileWriteTwo = new File("eg10_12_1_java.jpg");     //目的地
        try{
            BufferedImage image = ImageIO.read(fileRead);
            Graphics2D g = image.createGraphics();
            int width = image.getWidth();
            int height = image.getHeight();
            Font font = new Font("宋体",Font.BOLD,56);
            g.setFont(font);
            g.setColor(Color.blue);
            g.drawString("我喜欢java",width/2,height/2);
            ImageIO.write(image,"bmp",fileWriteOne);
            ImageIO.write(image,"jpg",fileWriteTwo);
        }
        catch(IOException e){
            System.out.println("Error + e");
        }
    }
}
