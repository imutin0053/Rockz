package Libraries_Using_Final;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String bookname = sc.nextLine();
        System.out.print("Enter Author name: ");
        String Author = sc.nextLine();
        Library l = new Library(bookname, Author);
        l.display();
        sc.close();
    }
}
