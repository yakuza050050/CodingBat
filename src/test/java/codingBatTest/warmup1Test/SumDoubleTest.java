package codingBatTest.warmup1Test;

import com.digital_nomads.codingBat.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTest {

    @Test
    void sumDoubleTest() {
        SumDouble sumDouble = new SumDouble();
        Assert.assertEquals(sumDouble.sumDouble(4, 4), 16);
    }
}
