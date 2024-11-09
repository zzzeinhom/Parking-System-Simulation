import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
*  InputParser class
*  Responsible for parsing the input file, creating car objects that carris
*  the information for cars' id, which gate they come from, parking duration and arrival time.
* */
public class InputParser {
    public static List<Car> parseInputFile(String filePath) {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                int gateId = Integer.parseInt(parts[0].split(" ")[1]);
                int carId = Integer.parseInt(parts[1].split(" ")[1]);
                int arrivalTime = Integer.parseInt(parts[2].split(" ")[1]);
                int parkingDuration = Integer.parseInt(parts[3].split(" ")[1]);

                cars.add(new Car(carId, arrivalTime, parkingDuration, gateId));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
