//7.2.1 和子类有关的匿名类

package bar7_2;

public class eg7_2_1 {
    public static void main(String[] args) {
        ShowBank showBank = new ShowBank();
        showBank.showMess(new Bank(){                               //向参数传递 Bank 的匿名子类对象
            public void output(){                                   //抽象类实现
                money += 100;
                System.out.printf("中国银行资金：%3d\n",money);
            }
        });
        showBank.showMess(new Bank(){                               //向参数传递 Bank  的匿名子类对象
            public void output(){                                   //抽象类实现
                money += 100;
                System.out.printf("建设银行资金：%3d\n",money);
            }
        });
    }
}
