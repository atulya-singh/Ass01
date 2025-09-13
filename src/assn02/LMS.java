package assn02;
import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Library Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Return a Book");
            System.out.println("Enter your choice:");

            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            if (n == 0) {
                System.out.println("Bye for now!");
                break; // exit loop
            }

            if (n == 1) {
                System.out.println("Enter book title:");
                String b = sc.nextLine();
                System.out.println("Enter book author:");
                String A = sc.nextLine();
                book.add_book(b, A);
            }
            else if (n == 2) {
                book.display_All(book.books);
            }
            else if (n == 3) {
                System.out.println("Enter book number to be checked out:");
                int h = sc.nextInt() - 1; // convert to 0-based index
                book.check_out_book(h);
            }
            else if (n == 4) {
                System.out.println("Enter book number to be returned:");
                int y = sc.nextInt() - 1; // convert to 0-based index
                book.return_book(y);
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
