package bar6_2;

public class AAA implements Com{                //AAA 类实现 Com 接口
    public void on() {                          //必须重写接口的 abstract 方法 on
        System.out.println("打开电视");
    }
    public float sum(float x, float y){         //必须重写接口的 abstract 方法 sum
        return x + y;
    }
}
