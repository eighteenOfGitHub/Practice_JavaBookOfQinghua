//6.11 应用举例

package bar6_11;

import com.sun.tools.javac.Main;

public class eg6_11_1 {
    public static void main(String[] args) {
        AdvertisementBoard board = new AdvertisementBoard();        //用于调用接口
        board.show();
        board.setAdvertisement(new BlackLandCorp());
        board.show();
        board.setAdvertisement(new WhiteCloudCorp());
        board.show();
    }
}
