package simpleFactory;

public class Add extends Operation{
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
