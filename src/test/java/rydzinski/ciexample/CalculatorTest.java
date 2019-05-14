package rydzinski.ciexample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        Assert.assertEquals(3, calculator.add(1,2));
        Assert.assertEquals(30, calculator.add(28,2));
        Assert.assertEquals(15, calculator.add(13,2));
        Assert.assertEquals(20, calculator.add(18,2));
        Assert.assertEquals(32, calculator.add(30,2));
    }

}