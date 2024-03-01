import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of garage system:");
        System.out.println("1 - First come first served slots");
        System.out.println("2 - Best fit");

        int systemConfig = scanner.nextInt();

        System.out.println("Enter the number of slots for your system:");
        int slotsNum = scanner.nextInt();

        Garage garage = Garage.setGarage(systemConfig);
        garage.setSlotsNum(slotsNum);

        for (int i = 0; i < slotsNum; i++) {
            System.out.println("Enter the dimensions of slot " + (i + 1) + " (width and length):");
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();
            garage.setSlotLenWid(length, width, i);
        }

        garage.displaySlots();
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1 - Park in");
            System.out.println("2 - Park out");
            System.out.println("3 - Display available slots");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    parkIn(scanner, garage, vehicles);
                    break;
                case 2:
                    parkOut(scanner, garage, vehicles);
                    break;
                case 3:
                    garage.displaySlots();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("Total Income: " + garage.getTotalIncome());
        scanner.close();
    }

    private static void parkIn(Scanner scanner, Garage garage, ArrayList<Vehicle> vehicles) {
        System.out.println("Add vehicle information: model, model year, width, length, and ID");
        String model = scanner.next();
        String year = scanner.next();
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        int id = scanner.nextInt();

        Vehicle vehicle = new Vehicle(model, year, id, length, width);
        vehicles.add(vehicle);
        garage.parkin(vehicle);
    }

    private static void parkOut(Scanner scanner, Garage garage, ArrayList<Vehicle> vehicles) {
        System.out.println("Enter the vehicle ID to park out:");
        int id = scanner.nextInt();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == id) {
                garage.parkout(id);
                vehicles.remove(i);
                break;
            }
        }
    }
}
