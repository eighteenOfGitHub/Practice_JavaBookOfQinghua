//eg9_6_5

package bar9_6;

import bar9_4.SetFont;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class MyDialog {
    public static final int YES_NO_OPTION = 1;
    static int backNumber[] = null;
    public static int[] showRandomArrayDiolog
            (Component parentComponent,String message,
             String title,int optionType,int max,int amount){
        backNumber = null;
        JDialog dialog = new JDialog((JFrame)parentComponent);
        dialog.setModal(true);
        dialog.setTitle(title);
        JLabel mess = new JLabel(message);
        JTextField showArray = new JTextField(20);  //显示得到的一组随机数
        int[] arraysNumber = getRandomNumber(max,amount);
        showArray.setText(Arrays.toString(arraysNumber));
        dialog.setLayout(new FlowLayout());
        JButton yesButton = new JButton();
        JButton noButton = new JButton();
        if(optionType == YES_NO_OPTION){
            yesButton.setText("是(Yes)");
            noButton.setText("否(No)");
        }else{
            JOptionPane.showMessageDialog(parentComponent,
                    "参数取值不正确","消息",JOptionPane.ERROR_MESSAGE);
            return backNumber;
        }
        dialog.add(mess);
        dialog.add(showArray);
        dialog.add(yesButton);
        dialog.add(noButton);
        yesButton.addActionListener((e)->{
            backNumber = arraysNumber;
            dialog.setVisible(false);
        });
        noButton.addActionListener((e)->{
            dialog.setVisible(false);
        });
        Font f = new Font("",Font.BOLD,28);
        SetFont.setFont(f,mess,showArray,yesButton,noButton);
        dialog.setBounds(500,60,600,300);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
        return backNumber;
    }
    private static int[] getRandomNumber(int max,int amount){
        //1至max之间的amount个不同随机整数（包括1和max）
        int[] randomNumber = new int[amount];
        Random random = new Random();
        int count = 0;
        while(count<amount){
            int number = random.nextInt(max)+1;
            boolean isInArrays = false;
            for (int m: randomNumber){      //m依次取数组randomNumber中元素的值
                if(m == number){
                    isInArrays =true;       //number 在数组中了
                    break;
                }
            }
            if(isInArrays == false){
                //如果number不在数组randomNumber中
                randomNumber[count] = number;
                count++;
            }
        }
        return randomNumber;
    }
}
