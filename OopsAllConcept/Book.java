package com.javabysakshi.OopsAllConcept;

public class Book extends LibraryItem{
private	String author;
public Book(int itemId, String title,String author) {
		super(itemId, title);
		this.author=author;
	}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public void displayInfo()
{
	System.out.println("Book 's author are "+author);
}

}
