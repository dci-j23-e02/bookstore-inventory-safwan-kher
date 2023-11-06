package sol.bookStore;

public class Book {
  // declare private attributes for title, author, price, and quantity in stock
  private String title;
  private String author;
  private double price;
  private int quantity;

  // Include a constructor to initialize these attributes
  public Book(String title, String author, double price, int quantity) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.quantity = quantity;
  }

  // Empty constructor for more flexibility

  //public Book() {

 // }

  //  getters and setters to access and modify attributes


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  //  a toString method to display the book information.

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
  }


}
