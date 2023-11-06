package sol.bookStore;

import java.util.List;

public class Inventory {
// declare a private 1D array of Book objects ( Or ArrayList)
  private List<Book> books; // more flexible to be able to instantiate by either 'ArrayList' or 'LinkedList'

// Include a method to add a book (which should add a Book object to the array)
  public void addBook(Book book) {
    Book bookToAdd = this.searchBookByTitle(book.getTitle());
    if(book == null){
      this.books.add(book);
    }else{
      book.setQuantity(book.getQuantity()+1) ; // increasing the quantity by one
    }
  }

// Include a method to remove a book (which should remove a Book from the array based on the title )
public void removeBook(String title){


    Book book = this.searchBookByTitle(title);
    if(book == null){
      System.out.println("We don't have this title !!");
    }else if(book.getQuantity() == 0){
      System.out.println("This book is already out of stock !!");
    } else{
      book.setQuantity(book.getQuantity()-1) ; // decreasing the quantity by one
    }






}


// a  method to search book by title
public Book searchBookByTitle(String title){
  for (Book book: this.books) {
    if(book.getTitle().toLowerCase().equals(title.toLowerCase())){
      return book;
    }
  }
  return null; // empty Book
}

// a method displays the total value of the inventory (the sum of the price of each book times its quantity in stock).

  public  double calculateTotalValue(){
    double totalPrice = 0;

    for (Book book:this.books) {
      totalPrice += (book.getPrice() * book.getQuantity());

    }


    return totalPrice;
  }


}
