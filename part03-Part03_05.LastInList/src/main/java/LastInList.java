
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        for (int i = 0; i < list.size(); i++) {
            int lastIndex = list.size() - 1;
            String lastString = list.get(lastIndex);
            System.out.println(lastString);
        
        }

    }
}
