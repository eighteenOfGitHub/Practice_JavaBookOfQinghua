package bar9_4;

import javax.swing.*;
import java.awt.*;

public class SetFont {
    public static void setFont(Font f, JComponent ...component){
        for(JComponent c:component){
            c.setFont(f);
        }
    }
}
