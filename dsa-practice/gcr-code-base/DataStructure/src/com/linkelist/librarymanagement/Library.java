package com.linkelist.librarymanagement;

public class Library {
	private BookNode head;
    private BookNode tail;

   
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

   
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos == 0) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

  
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

  
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

  
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

   
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

   
    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    
    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

   

    public int countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

   

    private void displayBook(BookNode book) {
        System.out.println(
            "ID: " + book.bookId +
            ", Title: " + book.title +
            ", Author: " + book.author +
            ", Genre: " + book.genre +
            ", Available: " + (book.isAvailable ? "Yes" : "No")
        );
    }
}
