import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataReader {
    public static Map<Integer, Integer> readFile(File file) throws FileNotFoundException {
        TreeMap<Integer, Integer> numbers = new TreeMap<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                int numberOccurrence = 1;
                if (numbers.containsKey(number)) {
                    numberOccurrence += numbers.get(number);
                }
                numbers.put(number, numberOccurrence);
            }
        }

        return numbers;
    }

    public static void printNumbers(Map<Integer, Integer> numbers) {
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
        }

    }
}
