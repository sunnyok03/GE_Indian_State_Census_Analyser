import org.bridgelabz.InvalidCSVFileException;
import org.bridgelabz.StateCensusAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class StateCensusTest {
    @Test
    public void happyTestSizeOfData() {
        final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensus.csv";
        Assert.assertEquals(StateCensusAnalyser.sizeOfData(SAMPLE_CSV_FILE_PATH), 37);
    }

    @Test(expected = InvalidCSVFileException.class)
    public void sadTestIncorrectCSVFile() {
        final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensuss.csv";
        StateCensusAnalyser.loadData(SAMPLE_CSV_FILE_PATH);
    }

    @Test(expected = InvalidCSVFileException.class)
    public void sadTestIncorrectCSVFileType() {
        final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensus.csb";
        StateCensusAnalyser.loadData(SAMPLE_CSV_FILE_PATH);
    }

    @Test(expected = InvalidCSVFileException.class)
    public void sadTestIncorrectCSVDelimiter() {
        final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensuss.csv";
        StateCensusAnalyser.loadData(SAMPLE_CSV_FILE_PATH);
    }
}
