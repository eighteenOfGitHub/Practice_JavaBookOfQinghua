package bar12_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StandardExamInTime extends JFrame implements ActionListener, ItemListener {
    File testFile;
    int MAX = 8;
    int maxTime = MAX,score = 0;
    javax.swing.Timer time;     //计时器
    JTextArea showQuesion;     //显示试题
    JCheckBox choiceA,choiceB,choiceC,choiceD;
    JLabel showScore,showTime;
    String correctAnswer;       //正确答案
    JButton reStart;
    FileReader inOne;
    BufferedReader inTwo;
    StandardExamInTime(){
        time = new Timer(1000,this);
        showQuesion = new JTextArea(2,16);
        setLayout(new FlowLayout());
        showScore = new JLabel("分数"+score);
        showTime = new JLabel(" ");
        add(showTime);
        add(new JLabel("问题："));
        add(showQuesion);
        choiceA = new JCheckBox("A");
        choiceB = new JCheckBox("B");
        choiceC = new JCheckBox("C");
        choiceD = new JCheckBox("D");
        choiceA.addActionListener(this);
        choiceB.addActionListener(this);
        choiceC.addActionListener(this);
        choiceD.addActionListener(this);
        add(choiceA);
        add(choiceB);
        add(choiceC);
        add(choiceD);
        reStart = new JButton("再做一次");
        reStart.setEnabled(false);
        add(reStart);
        reStart.addActionListener(this);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setMAX(int n){
        MAX = n;
    }
    public void setTestFile(File f){
        testFile = f;
        score = 0;
        try{
            inOne = new FileReader(testFile);
            inTwo = new BufferedReader(inOne);
            readOneQuesion();
            reStart.setEnabled(false);
        }
        catch(IOException exp){
            showQuesion.setText("没有选题");
        }
    }
    public void readOneQuesion(){
        showQuesion.setText(null);
        try{
            String s = null;
            while((s = inTwo.readLine()) != null){
                if(!s.startsWith("-"))
                    showQuesion.append("\n"+s);
                else{
                    s = s.replaceAll("-","");
                    correctAnswer = s;
                    break;
                }
            }
            time.start();
            if(s == null){
              inTwo.close();
              reStart.setEnabled(true);
              showQuesion.setText("题目完毕");
              time.stop();
            }
        }
        catch(IOException exp){}
    }
    public void itemStateChanged(ItemEvent e){
        JCheckBox box = (JCheckBox)e.getSource();
        String str = box.getText();
        boolean booOne = box.isSelected();
        boolean booTwo = str.compareToIgnoreCase(correctAnswer) == 0;
        if(booOne && booTwo){
            score++;
            showScore.setText("分数"+score);
            time.stop();            //停止计时
            maxTime = MAX;
            readOneQuesion();       //读入下一道题目
        }
        box.setSelected(false);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == time){
            showTime.setText("剩："+maxTime+"秒");
            maxTime--;
            if(maxTime <= 0){
                maxTime = MAX;
                readOneQuesion();       //读入下一道题目
            }
        } else if (e.getSource() == reStart) {
            setTestFile(testFile);
        }
    }
}
