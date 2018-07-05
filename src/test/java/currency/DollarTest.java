package currency;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class DollarTest {

    @Test
    public void testMultiplier() {
        Dollar dollar = Money.createDollar(10);
        Franc franc = Money.createFranc(10);

        assert (dollar.equals(franc));
        assertFalse(dollar.equals(franc));
    }
}
