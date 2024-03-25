import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Read term from the user
        String term = scanner.nextLine();

        // Read definition from the user
        String definition = scanner.nextLine();

        // Read user's answer
        String answer = scanner.nextLine();

        // Check if the user's answer matches the definition
        if (answer.equals(definition)) {
            System.out.println("Your answer is right!");
        } else {
            System.out.println("Your answer is wrong...");
        }

        scanner.close();
    }
}

