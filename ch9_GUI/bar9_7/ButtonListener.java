//eg9_7_2

package bar9_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    WinTable view;
    public void setView(WinTable view){this.view = view;}
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < 8; i++) {
            double sum = 0;
            boolean boo = true;
            for (int j = 1; j <= 2; j++) {
                try{
                    String str = view.a[i][j].toString();
                    sum = sum + Double.parseDouble(str);
                }catch(Exception ee){
                    boo = false;
                    view.table.repaint();
                }
                if(boo == true){
                    view.a[i][3] = ""+sum;
                    view.table.repaint();
                }
            }
        }
    }
}
