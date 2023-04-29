
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldestName = "";
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            String name = pieces[0].trim();
            int age = Integer.parseInt(pieces[1].trim());

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldest: " + oldestName);


    }
}
