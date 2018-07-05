package currency;

public class Franc extends Money {

    Franc(int amount) {
        super(amount, "CHF");
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
