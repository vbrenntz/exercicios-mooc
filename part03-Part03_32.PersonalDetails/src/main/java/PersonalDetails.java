
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfYear = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1].trim());

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sumOfYear += birthYear;
            count++;
        }

        double averageOfYear = (double) sumOfYear / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfYear);


    }
}
