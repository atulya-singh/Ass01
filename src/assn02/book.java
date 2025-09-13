package assn02;

public class book {
    public String bookname;
    public String author;

    book(String b, String a) {
        bookname = b;
        author = a;
    }

    public static book[] books = new book[5];
    public static boolean[] checkedOut = new boolean[5];
    static int pointer = 0;

    public static void add_book(String Book, String Author) {
        if (pointer >= books.length) {
            System.out.println("Book not added. Library is full!");
        } else {
            book obj = new book(Book, Author);
            books[pointer] = obj;
            checkedOut[pointer] = false;
            pointer++;
            System.out.println("Book added to library!");
        }
    }

    public static void check_out_book(int i) {
        if (i >= 0 && i < books.length && books[i] != null) {
            if (!checkedOut[i]) {
                checkedOut[i] = true;
                System.out.println("Book checked out!");
            } else {
                System.out.println("Book already checked out!");
            }
        } else {
            System.out.println("Invalid book number!");
        }
    }

    public static void display_All(book[] arr) {
        System.out.println("Books in Library:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println((i + 1) + ". Title: " + arr[i].bookname +
                        ", Author: " + arr[i].author +
                        ", Checked Out: " + (checkedOut[i] ? "Yes" : "No"));
            }
        }
    }

    public static void return_book(int j) {
        if (j >= 0 && j < books.length && books[j] != null) {
            if (checkedOut[j]) {
                checkedOut[j] = false;
                System.out.println("Book returned!");
            } else {
                System.out.println("Book was not checked out!");
            }
        } else {
            System.out.println("Invalid book number!");
        }
    }
}

