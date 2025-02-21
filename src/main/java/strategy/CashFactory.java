package strategy;

//收费工厂
public class CashFactory {
    public static CashSuper createCashAccept(int cashType){
        CashSuper cash = null;
        switch(cashType){
            case 1:
                cash = new CashNormal();
                break;
            case 2:
                cash = new CashRebate(0.8d);
                break;
            case 3:
                cash = new CashRebate(0.7d);
                break;
            case 4:
                cash = new CashReturn(300d,100d);
                break;
        }
        return cash;
    }
}
