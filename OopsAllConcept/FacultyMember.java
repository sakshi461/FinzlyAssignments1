package com.javabysakshi.OopsAllConcept;

public class FacultyMember extends LibraryMember {

	@Override
	public void borrowItem(LibraryItem item) {
		// TODO Auto-generated method stub
		System.out.println("The item ID for this item is "+item.getItemId());
		System.out.println("The item 's Title is "+item.getTitle());
		//System.out.println("Member name "+memberId+" Name "+name);
	}

}
