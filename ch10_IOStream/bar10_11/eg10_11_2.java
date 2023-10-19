//10.11 使用Scanner解析文件
//使用正则表达式作为分隔标记分析文件


package bar10_11;

import java.io.File;
import java.util.Scanner;

public class eg10_11_2 {
    public static void main(String[] args) {
        File file = new File("eg10_11_2_student.txt");
        Scanner sc = null;
        int count = 0;
        double sum = 0;
        try{
            double score = 0;
            sc = new Scanner(file);
            sc.useDelimiter("[^1234567890.]+");
            while(sc.hasNextDouble()){
                score = sc.nextDouble();
                count++;
                sum = sum + score;
                System.out.println(score);
            }
            double aver = sum/count;
            String str = String.format("%.3f",aver);
            System.out.println("平均成绩："+aver);
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
}
