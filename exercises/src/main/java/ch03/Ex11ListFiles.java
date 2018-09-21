package ch03;

import java.io.File;
import java.io.FileFilter;

public class Ex11ListFiles {
    private static File[] showDirsLambda(String path) {
        return new File(path).listFiles(item -> item.isDirectory());
    }

    private static File[] showDirsAnonClass(String path) {
        return new File(path).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

    private static File[] showDirsMethodRef(String path) {
        return new File(path).listFiles(File::isDirectory);
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\dizah_000\\IdeaProjects\\javaimpatient\\exercises\\src\\main\\java";
        for (File f : showDirsLambda(path)) {
            System.out.println(f.getName());
        }

        for (File f : showDirsMethodRef(path)) {
            System.out.println(f.getName());
        }

        for (File f : showDirsAnonClass(path)) {
            System.out.println(f.getName());
        }
    }
}
