//8.10.1/2  Arrays类/System类

package bar8_10;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class eg8_10_1 {
    public static void main(String[] args) {
        Random randomOne = new Random(2022);
        Random randomTwo = new Random(2022);
        int amount = 1000;
        int[] one = new int[amount];
        int[] two = new int[amount];
        for (int i = 0; i < amount; i++) {
            one[i] = randomOne.nextInt(amount);
            two[i] = randomTwo.nextInt(amount);
        }
        if(Arrays.equals(one,two)){
            System.out.println("两个数组相同，前八个元素分别是：");
            int[] a = Arrays.copyOf(one,8);
            int[] b = Arrays.copyOf(two,8);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
        else{
            System.out.println("两个数组不相等");
        }
        long startTime = System.nanoTime();
        Arrays.sort(one);
        Arrays.sort(two);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("排序两个数组的用时（纳秒）"+elapsedNanos);
    }
}
