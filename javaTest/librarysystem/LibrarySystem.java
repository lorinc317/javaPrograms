package librarysystem;

import java.util.Scanner;


public class LibrarySystem {
    
    public static void displayMenu()
    {
        System.out.println("Enter a command");
        System.out.println("0: exit");
        System.out.println("1: add a book");
        System.out.println("2: remove a book");
        System.out.println("3: display all books");
        System.out.println("4: search for a book");
        System.out.println("5: sort the books");
    }
    
    public static void main(String[] args) {
        boolean run = true;
        int command = 1;
        Scanner sc = new Scanner(System.in);
        
        while(run)
        {
            displayMenu();
           command =  sc.nextInt();
            switch(command)
            {
                case 0: { System.exit(0);  run = false; break;}
                case 1: { addBook(); break;}
                case 2: { removeBook(); break;}
                case 3: { Library.displayLibrary(); break;}
                case 4: {searchForBook(); break;}
                case 5: {sortBooks(); break;}
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    public static void addBook() {
         Book book = new Book();
         Scanner sc = new Scanner(System.in);
         String enter = "";
         System.out.println("Enter the book\'s title");
         enter = sc.nextLine();
         book.setTitle(enter);
         
         System.out.println("Enter the book\'s author");
         enter = sc.nextLine();
         book.setAuthor(enter);
         
         System.out.println("Enter the book\'s publisher");
         enter = sc.nextLine();
         book.setPublisher(enter);
         
         System.out.println("Enter the book\'s isbn");
         enter = sc.nextLine();
         book.setIsbn(Long.valueOf(enter));
         
         System.out.println("Enter the book\'s year of publication");
         enter = sc.nextLine();
         book.setYear(Integer.valueOf(enter));
         
         Library.lib.add(book);
         
         System.out.println("Done");
    }

    public static void removeBook() {
         
    }

    public static void searchForBook() {
        System.out.println("What do you want to look for?");
        System.out.println("0: back");
        System.out.println("1: Title");
        System.out.println("2: Author");
        System.out.println("3: Publisher");
        System.out.println("4: ISBN");
        System.out.println("5: year of publication");
        
        Scanner sc = new Scanner(System.in);
        int command = 1;
        String enter = "";
        command = sc.nextInt();
        
        switch(command)
        {
            case 0: {return;}
            case 1: {
                System.out.println("Enter the Title");
                enter = sc.nextLine();
                Library.searcByTitle(enter);
                Library.displaySearchResult();
                break;
            }
            case 2: {
                System.out.println("Enter the Author");
                enter = sc.nextLine();
                Library.searcByAuthor(enter);
                Library.displaySearchResult();
                break;}
            case 3: {
                System.out.println("Enter the Publisher");
                enter = sc.nextLine();
                Library.searcByPublisher(enter);
                Library.displaySearchResult();
                break;}
            case 4: {
                System.out.println("Enter the ISBN");
                enter = sc.nextLine();
                Library.searcByISBN(Long.valueOf(enter));
                Library.displaySearchResult();
                break;}
            case 5: {
                System.out.println("Enter the year of publication");
                enter = sc.nextLine();
                Library.searcByYear(Integer.valueOf(enter));
                Library.displaySearchResult();
                break;}
            default: 
                System.out.println("Wrong command");
        }
    }

    public static void sortBooks() {
       System.out.println("What do you want to sort by?");
        System.out.println("0: back");
        System.out.println("1: Title");
        System.out.println("2: Author");
        System.out.println("3: Publisher");
        System.out.println("4: ISBN");
        System.out.println("5: year of publication");
        
        Scanner sc = new Scanner(System.in);
        int command = 1;
        String enter = "";
        command = sc.nextInt();
        
        switch(command)
        {
            case 0: {return;}
            case 1: {
                Library.sortByTitle();
                Library.displayLibrary();
                break;
            }
            case 2: {
                Library.sortByAuthor();
                Library.displayLibrary();
                break;}
            case 3: {
                Library.sortByPublisher();
                Library.displayLibrary();
                break;}
            case 4: {
                Library.sortByISBN();
                Library.displayLibrary();
                break;}
            case 5: {
                Library.sortByYear();
                Library.displayLibrary();
                break;}
            default: 
                System.out.println("Wrong command");
        }
    }
}
