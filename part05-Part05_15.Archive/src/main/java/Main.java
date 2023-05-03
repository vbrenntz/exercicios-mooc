
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item newItem = new Item(identifier, name);
            boolean found = false;
            for (Item item : items) {
                if (item.getIdentifier().equals(identifier)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                items.add(new Item(identifier, name));
            }
        }

        System.out.println("\n==Items==");
        for (Item item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
    }
}
