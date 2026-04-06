public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names using delimiter ", "
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}