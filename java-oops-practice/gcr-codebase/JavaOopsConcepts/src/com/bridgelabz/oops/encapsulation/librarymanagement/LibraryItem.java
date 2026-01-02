package com.bridgelabz.oops.encapsulation.librarymanagement;

public abstract class LibraryItem {
	 private int itemId;
	    private String title;
	    private String author;

	    
	    private String borrowerName;

	    public LibraryItem(int itemId, String title, String author) {
	        this.itemId = itemId;
	        this.title = title;
	        this.author = author;
	    }

	    
	    public int getItemId() {
	        return itemId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    protected String getAuthor() {
	        return author;
	    }

	   
	    protected void setBorrowerName(String borrowerName) {
	        this.borrowerName = borrowerName;
	    }

	    protected String getBorrowerName() {
	        return borrowerName;
	    }

	   
	    public void getItemDetails() {
	        System.out.println("Item ID: " + itemId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }

	    
	    public abstract int getLoanDuration(); 
}
