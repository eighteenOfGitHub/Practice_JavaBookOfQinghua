//12.5 线程同步
//会计和出纳拥有同一个账本，对账本进行操作

package bar12_5;

public class eg12_5_1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setMoney(200);
        Thread  accountant,         //会计
                cashier;            //出纳
        accountant = new Thread(bank);
        cashier = new Thread(bank);
        accountant.setName("会计");
        cashier.setName("出纳");
        accountant.start();
        try{
            Thread.sleep(1000);
        }
        catch(Exception exp){}
        cashier.start();
    }
}
