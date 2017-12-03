package librarysystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

public class Library {

    public static List<Book> lib = new ArrayList();
    public static List<Book> lastSearchResult = new ArrayList();

    public static int addBook(Book b) {
        lib.add(b);
        return lib.size();
    }

    public static boolean isEmptySearch() {
        return lastSearchResult.isEmpty();
    }

    public static void displayLibrary() {
        if (!isEmptyLibrary()) {
            for (Book b : lib) {
                System.out.println(b.toString());
            }
        } else {
            System.out.println("Sorry, the library is empty!");
        }
    }
    
    public static void displaySearchResult() {
        if (!isEmptySearch()) {
            for (Book b : lastSearchResult) {
                System.out.println(b.toString());
            }
        } else {
            System.out.println("Sorry, no book was found to the search");
        }
    }

    public static boolean isEmptyLibrary() {
        return lib.isEmpty();
    }

    public static boolean contains(Book b) {
        return (lib.indexOf(b) != -1);
    }

    public static void searcByAuthor(String a) {
        lastSearchResult.clear();
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getAuthor().equals(a)) {
                lastSearchResult.add(lib.get(i));
            }
        }
    }

    public static void searcByTitle(String a) {
        lastSearchResult.clear();
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getTitle().equals(a)) {
                lastSearchResult.add(lib.get(i));
            }
        }
    }

    public static void searcByPublisher(String a) {
        lastSearchResult.clear();
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getPublisher().equals(a)) {
                lastSearchResult.add(lib.get(i));
            }
        }
    }

    public static void searcByYear(int y) {
        lastSearchResult.clear();
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getYear() == y) {
                lastSearchResult.add(lib.get(i));
            }
        }
    }

    public static void searcByISBN(long is) {
        lastSearchResult.clear();
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getIsbn() == is) {
                lastSearchResult.add(lib.get(i));
            }
        }
    }
    
    public static void sortByTitle()
    {
        Collections.sort(lib, Book.BookTitleComparator);
    }

    public static void sortByAuthor()
    {
        Collections.sort(lib, Book.BookAuthorComparator);
    }
    
    public static void sortByPublisher()
    {
        Collections.sort(lib, Book.BookPublisherComparator);
    }
    
    public static void sortByISBN()
    {
        Collections.sort(lib, Book.FruitISBNComparator);
    }
    
    public static void sortByYear()
    {
        Collections.sort(lib, Book.FruitYearComparator);
    }
    
}
