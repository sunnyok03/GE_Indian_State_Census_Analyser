package org.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StateCensusAnalyser {

    /*
    @desc: load data from csv file
    @params:
    @return:
     */
    public static void loadData(String SAMPLE_CSV_FILE_PATH) throws InvalidCSVFileException {
        try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> data = reader.readAll().stream().skip(1).toList();
            data.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (FileNotFoundException e) {
            throw new InvalidCSVFileException("Invalid file name.");
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] loadHeader(String SAMPLE_CSV_FILE_PATH) throws InvalidCSVFileException{
        try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> data = reader.readAll().stream().limit(1).toList();
            System.out.println(data.size());
            return data.get(0);
        } catch (FileNotFoundException e) {
            throw new InvalidCSVFileException("Invalid file name.");
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    @desc: returns number of rows of the csv file
    @params:
    @return: number of rows
     */
    public static int sizeOfData(String SAMPLE_CSV_FILE_PATH) {
        try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
            List<String[]> data = reader.readAll().stream().skip(1).toList();
            return data.size();
        } catch (IOException | RuntimeException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
