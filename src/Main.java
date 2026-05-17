import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        String FILE = "D:/Gi/BusReservationSystem/data/buses.txt";
        try {
            m.load(FILE);
        } catch (IOException e) {
            System.out.println("No saved data found.");
        }

        final String ADMIN_PASSWORD = "CodeWithAbdulSaleem";

        int choice;
        do {
            System.out.println("\n=== BUS RESERVATION SYSTEM ===");
            System.out.println("1. Add Bus (Admin only)");
            System.out.println("2. Show All Buses");
            System.out.println("3. Book Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Save & Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Admin Password: ");
                    String enteredPass = sc.nextLine();
                    if (enteredPass.equals(ADMIN_PASSWORD)) {
                        System.out.print("Enter Bus Number: ");
                        String busNo = sc.nextLine();
                        System.out.print("Enter Capacity: ");
                        int cap = sc.nextInt();
                        sc.nextLine();
                        m.addBus(new Bus(busNo, cap, 0));
                        System.out.println("Bus added successfully!");
                    } else {
                        System.out.println("Incorrect password! Access denied.");
                    }
                    break;

                case 2:
                    m.showBus();
                    break;

                case 3:
                    System.out.print("Enter Passenger Name: ");
                    String passenger = sc.nextLine();
                    System.out.print("Enter Bus Number: ");
                    String bookBus = sc.nextLine();
                    m.booking(passenger,bookBus);
                    break;

                case 4:
                    System.out.print("Enter Bus Number: ");
                    String cancelBus = sc.nextLine();
                    m.canceling(cancelBus);
                    break;

                case 5:
                    try {
                        m.save("buses.txt");
                        System.out.println("Data saved.");
                    } catch (IOException e) {
                        System.out.println("Error saving data.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
