package edu.uea;

public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData();

        System.out.println();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.processData();
    }
}