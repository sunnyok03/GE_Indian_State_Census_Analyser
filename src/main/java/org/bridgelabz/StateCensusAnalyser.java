package org.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StateCensusAnalyser {
    public static final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensus.csv";

    public static void loadData() {
        try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> data = reader.readAll().stream().skip(1).toList();
            data.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (IOException | RuntimeException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public static int sizeOfData() {
        try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> data = reader.readAll().stream().skip(1).toList();
            return data.size();
        } catch (IOException | RuntimeException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
