package ch03;

import java.io.File;
import java.util.Arrays;

public class Ex13SortLs {
    public static void main(String[] args) {
        String path = "C:\\Users\\dizah_000\\IdeaProjects\\javaimpatient";
        File[] files = new File(path).listFiles();
        System.out.println(Arrays.toString(files));
        sort(files);
        System.out.println(Arrays.toString(files));
    }

    private static void sort(File[] files) {
        Arrays.sort(files, (file1, file2) -> {
            if (file1.isDirectory() && file2.isDirectory()) {
                return file1.getPath().compareTo(file2.getPath());
            }
            else if (file1.isDirectory() && file2.isFile()) {
                return -1;
            }
            else if (file1.isFile() && file2.isDirectory()) {
                return 1;
            }
            else {
                return file1.getPath().compareTo(file2.getPath());
            }
        });
    }
}
