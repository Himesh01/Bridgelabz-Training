package javadesignpatternpractice.LibraryManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

 private static LibraryCatalog instance;

 private List<Book> books = new ArrayList<>();
 private List<Observer> observers = new ArrayList<>();

 private LibraryCatalog() {}

 public static synchronized LibraryCatalog getInstance() {
     if (instance == null) {
         instance = new LibraryCatalog();
     }
     return instance;
 }

 public void addBook(Book book) {
     books.add(book);
     notifyObservers("New book available: " + book.getTitle());
 }

 public void addObserver(Observer observer) {
     observers.add(observer);
 }

 public void removeObserver(Observer observer) {
     observers.remove(observer);
 }

 private void notifyObservers(String message) {
     for (Observer observer : observers) {
         observer.update(message);
     }
 }
}
