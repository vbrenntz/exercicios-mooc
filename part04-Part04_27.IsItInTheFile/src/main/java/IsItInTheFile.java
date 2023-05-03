
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(line);
            }
            sc.close();
            boolean found = false;
            for (String line : list) {
                if (line.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
