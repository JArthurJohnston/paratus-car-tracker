package com.paratusSoftware.carTracker.util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static final String FILE_ERROR_MESSAGE = "Could not open file";
    public static final String NEWLINE = "\n\r";

    public static String contentFrom(String fileName){
        StringBuilder result = new StringBuilder("");

        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append(NEWLINE);
            }

            scanner.close();

        } catch (IOException e) {
            return FILE_ERROR_MESSAGE;
        }
        return result.toString();
    }
}
