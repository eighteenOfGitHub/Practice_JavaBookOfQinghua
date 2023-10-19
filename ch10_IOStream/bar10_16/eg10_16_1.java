//10.16 应用举例
//标准化考试

//使用到的类：
//StandardExam

package bar10_16;

import java.io.File;

public class eg10_16_1 {
    public static void main(String[] args) {
        StandardExam exam = new StandardExam();
        File f = new File("eg10_16_1_test.txt");
        exam.setTestFile(f);
        exam.startExamine();
    }
}
