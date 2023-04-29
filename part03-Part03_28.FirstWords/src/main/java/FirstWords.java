
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (!input.isEmpty()) {
                String[] pieces = input.split(" ");
                for (String piece : pieces) {
                    piece = pieces[0];
                    System.out.println(piece);
                    break;
                }
            } else {
                break;
            }

        }

    }
}
