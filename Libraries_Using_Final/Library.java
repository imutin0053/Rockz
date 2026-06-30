package Libraries_Using_Final;

public class Library {
    final String LibraryName = "Central Library";
    private String bookname;
    private String Author;

    public Library(String bookname, String Author) {
        this.bookname = bookname;
        this.Author = Author;
    }

    public final void display() {
        System.out.println("Library name: " + this.LibraryName);
        System.out.println("Book name: " + this.bookname);
        System.out.println("Author name: " + this.Author);
    }
}
