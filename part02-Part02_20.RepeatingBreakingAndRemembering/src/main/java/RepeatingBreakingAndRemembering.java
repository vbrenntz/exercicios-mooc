
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int totalNum = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());

            if (numbers == -1) {
                break;
            }
            if (numbers != -1) {
                sum = sum + numbers;
                totalNum++;
            }
            if (numbers % 2 == 0) {
                even++;
            }
            if (numbers % 2 != 0) {
                odd++;
            }

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNum);
        System.out.println("Average: " + (double) sum / totalNum);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
