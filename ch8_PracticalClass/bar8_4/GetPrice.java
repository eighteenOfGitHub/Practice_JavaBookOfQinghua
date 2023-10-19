package bar8_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetPrice {
    public static double givePriceSum(String cost){
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");    //scanner 设置分隔标记
        double sum = 0;
        while (scanner.hasNext()){
            try {
                double price = scanner.nextDouble();
                sum += price;
            }
            catch (InputMismatchException exp){
                String t = scanner.next();
            }
        }
        return sum;
    }
}
