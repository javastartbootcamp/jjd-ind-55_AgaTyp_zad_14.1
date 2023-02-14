import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("liczby.txt");

        Map<Integer, Integer> numbers = DataReader.readFile(file);

        DataReader.printNumbers(numbers);

    }

}
