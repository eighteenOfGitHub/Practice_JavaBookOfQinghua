package bar6_2;

public interface Com {
    public static final int MAX = 100;                  //等价： int MAX = 100;
    public abstract void on();                          //等价： void on();
    public abstract  float sum(float a, float b);
    default int max(int a,int b){                       //default 方法
        outPutJava();                                   //调用端口中的 private 方法
        return a>b?a:b;
    }
    public static void f(){                             //static 方法
        System.out.println("注意是从 Java SE 8 开始的");
    }
    private void outPutJava(){
        System.out.println("Java");
    }
}
