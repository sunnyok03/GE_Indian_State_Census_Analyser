package org.bridgelabz;

public class Main {
    public static void main(String[] args) throws InvalidCSVFileException {
        System.out.println("Welcome to Indian State Census Analyzer!!!");
            StateCensusAnalyser.loadData();
        System.out.println("Size of data: " + StateCensusAnalyser.sizeOfData());
    }
}