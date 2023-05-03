
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();
            if (!input.equals("end")) {
                int num = Integer.parseInt(input);
                int cube = num * num * num;
                System.out.println(cube);
            }
        } while (!input.equals("end"));

        scanner.close();
    }

}
