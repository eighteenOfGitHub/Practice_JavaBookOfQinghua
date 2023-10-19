//eg9_4_4

package bar9_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleListener implements ActionListener {
    WindowDocument view;
    public void setView(WindowDocument view){
        this.view = view;
    }
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        if(str.equals("copy")) {
            view.showText.copy();
        } else if (str.equals("cut")) {
            view.show(str.equals("cut"));
        } else if (str.equals("paste")) {
            view.showText.paste();
        }
    }
}
