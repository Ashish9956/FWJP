package Day9;
import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int names[] = {101, 102, 103};
        String pwd[] = {"123", "234", "345"};

        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        System.out.println("Enter Password:");
        String pwdd = sc.nextLine();

        boolean isLoggedIn = false; // Flag to track login status

        for (int i = 0; i < names.length; i++) {
            if (id == names[i] && pwd[i].equals(pwdd)) {
                System.out.println("Successful login!");
                isLoggedIn = true;
                break; // Exit loop after successful login
            }
        }

        if (!isLoggedIn) {
            System.out.println("Invalid username or password.");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
