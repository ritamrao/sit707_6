package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsTest {

    @Test
    public void testSumUpToN() {
        Assert.assertEquals(55, ConditionalLoops.sumUpToN(10));
        Assert.assertEquals(15, ConditionalLoops.sumUpToN(5));
        Assert.assertEquals(1, ConditionalLoops.sumUpToN(1));
        Assert.assertEquals(0, ConditionalLoops.sumUpToN(0));
    }

    @Test
    public void testSumEvenUpToN() {
        Assert.assertEquals(30, ConditionalLoops.sumEvenUpToN(10));
        Assert.assertEquals(12, ConditionalLoops.sumEvenUpToN(6));
        Assert.assertEquals(0, ConditionalLoops.sumEvenUpToN(5));
        Assert.assertEquals(0, ConditionalLoops.sumEvenUpToN(1));
        Assert.assertEquals(0, ConditionalLoops.sumEvenUpToN(0));
    }
}
