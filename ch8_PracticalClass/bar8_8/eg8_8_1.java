//8.8.2 BigInteger类

package bar8_8;

import java.math.BigInteger;

public class eg8_8_1 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("0"),
                one = new BigInteger("123456789"),
                two = new BigInteger("987654321");
        result = one.add(two);
        System.out.println("和："+result);
        result = one.multiply(two);
        System.out.println("积："+result);

    }
}
