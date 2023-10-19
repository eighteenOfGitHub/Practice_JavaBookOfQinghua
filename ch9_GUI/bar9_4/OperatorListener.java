//eg9_4_3

package bar9_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OperatorListener implements ItemListener, ActionListener {
    NumberView view;
    public void setView(NumberView view){
        this.view = view;
    }
    public void itemStateChanged(ItemEvent e){
        String fuhao = view.choiceFuhao.getSelectedItem().toString();
        view.computer.setFuhao(fuhao);
    }
    public void actionPerformed(ActionEvent e){
        String fuhao = view.choiceFuhao.getSelectedItem().toString();
        view.computer.setFuhao(fuhao);
    }
}
