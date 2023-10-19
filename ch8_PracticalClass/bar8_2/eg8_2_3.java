package bar8_2;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class eg8_2_3 {
    public static void main(String[] args) {
        System.out.println("一行文本：");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "[\\s\\d\\p{Punct}]+";
        String words[] = str.split(regex);
        for (int i = 0; i < words.length; i++) {
            int m = i + 1;
            System.out.println("单词" + m + "：" + words[i]);
        }
    }
}
