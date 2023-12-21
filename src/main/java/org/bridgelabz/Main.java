package org.bridgelabz;

public class Main {
    public static void main(String[] args) throws InvalidCSVFileException {
        System.out.println("Welcome to Indian State Census Analyzer!!!");

        final String SAMPLE_CSV_FILE_PATH = "src/main/java/org/bridgelabz/StateCensus.csv";

        StateCensusAnalyser.loadData(SAMPLE_CSV_FILE_PATH);
        System.out.println("Size of data: " + StateCensusAnalyser.sizeOfData(SAMPLE_CSV_FILE_PATH));
    }
}