
import java.util.Scanner;


public class FromOneToParameter {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int number = Integer.valueOf(sc.nextLine());
        printUntilNumber(number);

    }

    public static void printUntilNumber(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.println(i);

        }
    }
}
