
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (!input.isEmpty()) {
                String[] pieces = input.split(" ");
                System.out.println(pieces[pieces.length - 1]);
            } else {
                break;
            }

        }


    }
}
