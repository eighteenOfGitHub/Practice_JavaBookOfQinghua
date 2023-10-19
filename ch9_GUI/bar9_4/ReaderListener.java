//eg9_4_1

package bar9_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderListener implements ActionListener {     //负责创建监视器的类
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();                  //获得封装在实践中的“命令”字符串
        System.out.println(str + ":" + str.length());
    }
}
