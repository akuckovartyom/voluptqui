import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PartitionDataPoints {

    public static void main(String[] args) {
        // Sample data points
        List<Integer> dataPoints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partition data points into even and odd numbers
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer point : dataPoints) {
            if (point % 2 == 0) {
                evenNumbers.add(point);
            } else {
                oddNumbers.add(point);
            }
        }

        // Write partitions to separate files
        try {
            writeToFile("even_numbers.txt", evenNumbers);
            writeToFile("odd_numbers.txt", oddNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filename, List<Integer> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Integer point : data) {
                writer.write(point.toString());
                writer.newLine();
            }
        }
    }
}
