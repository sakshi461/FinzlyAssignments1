package com.javabysakshi.OopsAllConcept;

 abstract class LibraryMember {
int memberId;
String name;

 public int getMemberId() {
	return memberId;
}

public void setMemberId(int memberId) {
	this.memberId = memberId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public abstract void borrowItem(LibraryItem item);
 }
