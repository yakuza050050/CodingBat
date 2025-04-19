package codingBatTest.warmup1Test;

import com.digital_nomads.codingBat.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumDoubleTest {
    SumDouble sumDouble;

    @BeforeClass
    void beforeClassTest() {
        sumDouble = new SumDouble();
    }

    @Test
    void sumDoubleTest() {
        Assert.assertEquals(sumDouble.sumDouble(4, 4), 16);
    }
}
