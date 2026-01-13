package com.bookShelff;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Book))
			return false;
		Book b = (Book) obj;
		return title.equals(b.title) && author.equals(b.author);
	}
	@Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
