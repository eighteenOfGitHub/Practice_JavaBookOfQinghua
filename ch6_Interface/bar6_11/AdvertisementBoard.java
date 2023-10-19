package bar6_11;

public class AdvertisementBoard {
    Advertisement adver;                        //负责创建广告牌
    public void setAdvertisement(Advertisement adver){
        this.adver = adver;
    }
    public void show(){
        if(adver == null){
            System.out.println("广告招商中");
        }
        else{
            adver.showAdvertisement();          //接口回调
        }
    }
}
