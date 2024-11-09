import java.util.List;

// This class is to be done by nour, i was just testing the parser
// To do...
// implementing Gate classes
// Design the Parking Lot with Thread Synchronization
// Handle Car Arrival and Parking Logic
// logging and status reporting

public class ParkingSimulator {
    public static void main(String[] args) {
        String inputFilePath = "InputOutput/input.txt";
        List<Car> cars = InputParser.parseInputFile(inputFilePath);

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
