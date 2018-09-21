package ch03;

import java.io.File;
import java.io.FilenameFilter;

public class Ex12FileFilter {
    private static String[] listFiles(String path, FilenameFilter fnFilter) {
        return new File(path).list(fnFilter);
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\dizah_000\\IdeaProjects\\javaimpatient\\exercises\\src\\main\\java\\ch02";
        for (String s : listFiles(path, (dir, name) -> name.endsWith(".java"))) {
            System.out.println(s);
        }
    }
}
