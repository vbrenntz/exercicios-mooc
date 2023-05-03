
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        ArrayList<String> lines = new ArrayList<>();

        if (file.equals(file)) {
            try {
                Scanner sc = new Scanner(Paths.get(file));
                while (sc.hasNextLine()) {
                    lines.add(sc.nextLine());
                }
                for (String line : lines) {
                    System.out.println(line);
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        if (file.equals(file)) {
            try {
                Scanner sc = new Scanner(Paths.get(file));
                while (sc.hasNextLine()) {
                    lines.add(sc.nextLine());
                }
                for (String line : lines) {
                    System.out.println(line);
                }
                sc.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
