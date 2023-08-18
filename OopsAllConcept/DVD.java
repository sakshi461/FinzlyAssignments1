package com.javabysakshi.OopsAllConcept;

 class DVD extends LibraryItem {

	private int duration;

	public DVD(int itemId, String title,int duration) {
		super(itemId, title);
		this.duration =duration;
	}

	public void displayInfo()
	{
		System.out.println("this dvd is  "+duration+" hrs long");
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
