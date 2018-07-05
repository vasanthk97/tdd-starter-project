package currency;

public class Dollar extends Money {

    Dollar(int amount) {
        super(amount, "USD");
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
