package bar12_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Win extends JFrame implements Runnable, ActionListener {
    Thread showTime = null;
    JTextArea text = null;
    JButton buttonStart = new JButton("start"),
            buttonStop = new JButton("stop");
    boolean die;
    SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
    Date date;
    Win(){
        showTime = new Thread(this);
        text = new JTextArea();
        add(new JScrollPane(text), BorderLayout.CENTER);
        JPanel p = new JPanel();
        p.add(buttonStart);
        p.add(buttonStop);
        buttonStart.addActionListener(this);
        buttonStop.addActionListener(this);
        add(p,BorderLayout.NORTH);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonStart){
            if(!(showTime.isAlive())){
                showTime = new Thread(this);
                die = false;
                try{
                    showTime.start();   //在AWT-EventQuecue线程中启动showTime线程
                }catch(Exception el){
                    text.setText("线程没有结束run方法之前不要在调用start()方法");
                }
            } else if (e.getSource() == buttonStop) {
                die = true;
            }
        }
    }
    public void run(){
        while(true){
            date = new Date();
            text.append("\n"+m.format(date));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ee){}
            if(die == true){
                return;
            }
        }
    }
}
