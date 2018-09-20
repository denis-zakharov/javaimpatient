package ch02;

import java.io.FileReader;
import java.util.Map;

import com.opencsv.CSVReaderHeaderAware;

public class Ex13OpenCsv {
    public static void main(String[] args) throws Exception {
        CSVReaderHeaderAware reader = new CSVReaderHeaderAware(
                new FileReader("C:\\Users\\dizah_000\\IdeaProjects\\javaimpatient\\exercises\\src\\main\\resources\\ex13.csv"));
        Map<String, String> values;
        while ((values = reader.readMap()) != null) {
            System.out.println(values);
        }
    }
}
