//12.11 应用举例

package bar12_11;

import java.io.File;

public class eg12_11_1 {
    public static void main(String[] args) {
        StandardExamInTime win = new StandardExamInTime();
        win.setTitle("限时回答问题");
        win.setTestFile(new File("eg10_16_1_test.txt"));
        win.setMAX(8);
    }
}
