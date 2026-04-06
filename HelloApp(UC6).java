public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = "";

            // Enhanced for-loop to concatenate names
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", " using substring
            names = names.substring(0, names.length() - 2);

            // Final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}