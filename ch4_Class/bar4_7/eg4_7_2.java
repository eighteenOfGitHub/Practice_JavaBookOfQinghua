//4.7.4 实例方法和类方法的区别（用Arrays举例）
//      1. Arrays.sort();
//      2. Arrays.binarySearch();

package bar4_7;
import java.util.*;
public class eg4_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {12,34,9,23,45,6,45,90,123,19,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));             //打印数组
        System.out.println("输入整数，程序判断该整数是否在数组中：");
        int number = scanner.nextInt();
        int index = Arrays.binarySearch(a,number);
        if (index >= 0){
            System.out.println(number + " 和数组中索引为 " + index +" 的元素值相同");
        }
        else{
            System.out.println(number + "不与数组中的任何元素值相同");
        }
    }
}
