import java.util.*;

public class HelloApp {

    static Scanner sc = new Scanner(System.in);
    static NameManager manager = new NameManager();

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Command line arguments
        if (args.length > 0) {
            for (String name : args) {
                manager.addName(name);
            }
        }

        while (true) {
            System.out.println("\n1. Add Name");
            System.out.println("2. List Names");
            System.out.println("3. Remove Name");
            System.out.println("4. Show Banner");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    manager.addName(name);
                    break;

                case 2:
                    manager.listNames();
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    manager.removeName(removeName);
                    break;

                case 4:
                    BannerPrinter.printBanner(manager.getNames());
                    break;

                case 5:
                    manager.saveNames();
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}