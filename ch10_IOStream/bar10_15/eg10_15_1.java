//10.15 文件锁

package bar10_15;

import java.io.File;

public class eg10_15_1 {
    public static void main(String[] args) {
        File file = new File("eg10_15_1.java");
        WindowFileLock win = new WindowFileLock(file);
        win.setTitle("使用文件锁");
    }
}
