package codingBatTest.warmup1Test;

import com.digital_nomads.codingBat.warmup1.SleepIn;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SleepInTest {
    SleepIn sleepIn;

    @BeforeClass
    void startClass() {
        sleepIn = new SleepIn();
    }

    @Test
    void sleepInTest() {
            Assert.assertTrue(sleepIn.sleepInSolution(true, true));
    }
}
