package com.javabysakshi.OopsAllConcept;

public class StudentMember extends LibraryMember {

	@Override
	public void borrowItem(LibraryItem item) {
		System.out.println("The Item id of this Library Item is----> "+item.getItemId());
		System.out.println("The title of book is---->   "+item.getTitle());
		
		
	}

}
