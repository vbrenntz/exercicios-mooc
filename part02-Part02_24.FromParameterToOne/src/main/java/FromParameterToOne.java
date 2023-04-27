
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.valueOf(sc.nextLine());
        printFromNumberToOne(number);

    }

    public static void printFromNumberToOne(int number) {

        while (number >= 1) {
            
            System.out.println(number);
            number--;

        }

    }

}
