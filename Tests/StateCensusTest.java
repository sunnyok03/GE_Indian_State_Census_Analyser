import org.bridgelabz.InvalidCSVFileException;
import org.bridgelabz.StateCensusAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class StateCensusTest {
    @Test
    public void happyTestSizeOfData() {
        Assert.assertEquals(StateCensusAnalyser.sizeOfData(), 37);
    }

    @Test(expected = InvalidCSVFileException.class)
    public void sadTestIncorrectCSVFile() {
        StateCensusAnalyser.loadData();
    }
}
