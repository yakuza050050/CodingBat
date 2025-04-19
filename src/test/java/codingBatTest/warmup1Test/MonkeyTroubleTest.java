package codingBatTest.warmup1Test;

import com.digital_nomads.codingBat.warmup1.MonkeyTrouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonkeyTroubleTest {


    @Test
    void MonkeyTroubleTest() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        Assert.assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }
}
