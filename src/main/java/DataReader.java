import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataReader {
    public static Map<Integer, Integer> readFile(File file) throws FileNotFoundException {
        final int linesNo = countLines(file);
        TreeMap<Integer, Integer> numbers = new TreeMap<>();

        try (Scanner sc = new Scanner(file)) {
            for (int i = 0; i < linesNo; i++) {
                String numberLine = sc.nextLine();
                int number = Integer.parseInt(numberLine);
                int numberOccurrence = 1;
                if (numbers.containsKey(number)) {
                    numberOccurrence += numbers.get(number);
                }
                numbers.put(number, numberOccurrence);
            }
        }

        return numbers;
    }

    private static int countLines(File file) throws FileNotFoundException {
        int lines = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
        }
        return lines;
    }

    public static void printNumbers(Map<Integer, Integer> numbers) {
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
        }

    }
}
