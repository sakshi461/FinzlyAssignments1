package com.javabysakshi.OopsAllConcept;

public class LibraryItem {

	private int itemId;
    private String title;


public LibraryItem(int itemId, String title) {
	//super();
	this.itemId = itemId;
	this.title = title;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
	
}
public void displayInfo()
{
	System.out.println("Title of the book is "+title+"  and itemId is "+itemId);
}
}
