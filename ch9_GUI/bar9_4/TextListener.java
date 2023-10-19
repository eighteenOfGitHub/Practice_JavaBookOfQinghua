//eg9_4_4

package bar9_4;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Arrays;

public class TextListener implements DocumentListener {
    WindowDocument view;
    public void setView(WindowDocument view){
        this.view = view;
    }
    public void changedUpdate(DocumentEvent e){
        String str = view.inputText.getText();
        String regex = "[\\s\\d\\p{Punct}]+";       //空格，数字和键盘上的符号的正则表达式
        String[] words = str.split(regex);
        Arrays.sort(words);                         //按照字典序从小到大排序
        view.showText.setText(null);
        for (int i = 0; i < words.length; i++) {
            view.showText.append(words[i]+",");
        }
    }
    public void removeUpdate(DocumentEvent e){
        changedUpdate(e);
    }
    public void insertUpdate(DocumentEvent e){
        changedUpdate(e);
    }
}
