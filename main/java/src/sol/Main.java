package sol;

import java.util.ArrayList;
import sol.bookStore.Inventory;
import sol.bookStore.Book;

public class Main {

  public static void main(String[] args) {

    ArrayList<Book> books = new ArrayList<>();
    Book b1 = new Book("Harry Potter", "J.K. Rowling", 39.99, 0);
    Book b2 = new Book("Potter", "J.K. Rowling", 40.99, 2);
    Book b3 = new Book("Harry", "J.K. Rowling", 30.99, 10);


    books.add(b1);
    books.add(b2);
    books.add(b3);

    // System.out.println(b3.toString());
   Inventory inventory = new Inventory(books);

   // System.out.println(inventory.searchBookByTitle("java")); // null
    inventory.addBook(b2);
    System.out.println(inventory.calculateTotalValue()); // 432.87
    System.out.println(inventory.getBooks().get(0).getQuantity());
    System.out.println(inventory.getBooks().get(1).getQuantity());
    System.out.println(inventory.getBooks().get(2).getQuantity());


    inventory.removeBook("Potter");
    System.out.println(inventory.calculateTotalValue()); // 391.88
    System.out.println(inventory.getBooks().get(0).getQuantity());
    System.out.println(inventory.getBooks().get(1).getQuantity());
    System.out.println(inventory.getBooks().get(2).getQuantity());




  }
}
