package simpleFactory;

public class Sub extends Operation{
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
