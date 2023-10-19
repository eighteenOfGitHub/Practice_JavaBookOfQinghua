package bar7_1;

public class RedCowFarm {
    static String farmName;
    RedCow cow;                 //内部类声明对象
    RedCowFarm(){}
    RedCowFarm(String s){
        cow = new RedCow(150,112,50000);
        farmName = s;
    }
    public void showCowMess() {
        cow.speak();
    }
    static class RedCow{                           //内部类的声明
        String cowName = "红牛";
        int height,weight,price;
        RedCow(int h,int w,int p){
            this.height = h;
            this.weight = w;
            this.price = p;
        }
        void speak(){
            System.out.println("偶是" + cowName +
                    "，身高：" + height +
                    "cm 体重：" + weight +
                    "kg，生活在 " + farmName);
        }
    }
}
