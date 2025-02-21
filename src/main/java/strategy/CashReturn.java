package strategy;

public class CashReturn extends CashSuper{
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if(moneyCondition>0 && result>=moneyReturn)
            result = result - Math.floor(result / moneyCondition) *num;
        return result;
    }
}
