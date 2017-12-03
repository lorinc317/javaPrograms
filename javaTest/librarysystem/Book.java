
package librarysystem;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Book implements Serializable{

  private String author;
  private String title;
  private long isbn;
  private String publisher;
  private int year;
  
  public Book(String a, String t, long i, String p, int y)
  {
    this.author = a;
    this.title = t;
    this.isbn = i;
    this.publisher = p;
    this.year = y;
  }
  
  public Book()
  {
    this("","", 0,"",0);
  }
  
  public String getAuthor()
  {
    return this.author;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public long getIsbn()
  {
    return this.isbn;
  }
  
  public String getPublisher()
  {
    return this.publisher;
  }
  
  public int getYear()
  {
    return this.year;
  }
  
  public void setAuthor(String s)
  {
     this.author = s;
  }
  
  public void setTitle(String s)
  {
     this.title = s;
  }
  
  public void setIsbn(long i)
  {
     this.isbn = i;
  }
  
  public void setPublisher(String s)
  {
     this.publisher = s;
  }
  
  public void setYear(int y)
  {
     this.year = y;
  }
  
  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    
    sb.append("Title: " + this.getTitle() + "\n");
    sb.append("Author: " + this.getAuthor() + "\n");
    sb.append("Publisher: " + this.getPublisher() + "\n");
    sb.append("ISBN: " + this.getIsbn()  + "\n");
    sb.append("Year of publication: " + this.getYear() + "\n");
    
    return sb.toString();
  }
  
  
  @Override
  public boolean equals(Object o)
  {
    if (o == null) return false;
    if (o == this) return true;
    if (!(o instanceof Book))return false;
    Book b = (Book)o;
    
    if(!b.author.equals(this.author)) return false;
    if(!b.title.equals(this.title)) return false;
    if(!b.publisher.equals(this.publisher)) return false;
    if(b.year != this.year) return false;
    if(b.isbn != this.isbn) return false;
    
    return true;
  }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.author);
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + (int) (this.isbn ^ (this.isbn >>> 32));
        hash = 47 * hash + Objects.hashCode(this.publisher);
        hash = 47 * hash + this.year;
        return hash;
    }
    
    public static Comparator<Book> BookAuthorComparator
                          = new Comparator<Book>() {

            @Override
	    public int compare(Book b1, Book b2) {

	      String author1 = b1.author.toUpperCase();
	      String author2 = b2.author.toUpperCase();

	      //ascending order
	      return author1.compareTo(author2);
	    }

	}; 
    public static Comparator<Book> BookTitleComparator
                          = new Comparator<Book>() {

            @Override
	    public int compare(Book b1, Book b2) {

	      String title1 = b1.title.toUpperCase();
	      String title2 = b2.title.toUpperCase();

	      //ascending order
	      return title1.compareTo(title2);
	    }

	}; 
    
    public static Comparator<Book> BookPublisherComparator
                          = new Comparator<Book>() {

            @Override
	    public int compare(Book b1, Book b2) {

	      String publisher1 = b1.publisher.toUpperCase();
	      String publisher2 = b2.publisher.toUpperCase();

	      //ascending order
	      return publisher1.compareTo(publisher2);
	    }

	}; 
  
    public static Comparator<Book> BookYearComparator
                          = new Comparator<Book>() {

            @Override
	    public int compare(Book b1, Book b2) {

	      int y1 = b1.year;
	      int y2 = b2.year;

	      //ascending order
	      if(y1> y2) return 1;
              else if (y1 < y2) return -1;
              else return 0;
            }
	}; 
    
    public static Comparator<Book> BookISBNComparator
                          = new Comparator<Book>() {

            @Override
	    public int compare(Book b1, Book b2) {

	      long i1 = b1.isbn;
	      long i2 = b2.isbn;

	      //ascending order
	      if(i1> i2) return 1;
              else if (i1 < i2) return -1;
              else return 0;
            }
	};
}
