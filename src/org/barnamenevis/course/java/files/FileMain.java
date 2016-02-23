package org.barnamenevis.course.java.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {

//        File afile = new File("files"+File.separator+"test.txt");

        Path file = Paths.get("files" + File.separator + "test.txt");

        try (Scanner scanner = new Scanner(file)) {

            int lineCount = 0;

            while (scanner.hasNextLine()) {
                lineCount++;
                String line = scanner.nextLine();

                FileWriter fileWriter = new FileWriter("files"+File.separator+lineCount + ".txt", true);
                try (Formatter formatter = new Formatter(fileWriter)) {
                    formatter.format("%s%n", line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
