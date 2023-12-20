import org.bridgelabz.StateCensusAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class StateCensusTest {
    @Test
    public void happyTestSizeOfData() {
        Assert.assertEquals(StateCensusAnalyser.sizeOfData(), 37);
    }
}
