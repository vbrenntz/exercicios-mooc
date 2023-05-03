
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            book.add(new Book(name, pages, year));
        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();

        if (info.equals("everything")) {
            for (Book books : book) {
                System.out.println(books.toString());
            }
        } else if (info.equals("name")) {
            for (Book books : book) {
                System.out.println(books.getName());
            }
        }
    }
}
