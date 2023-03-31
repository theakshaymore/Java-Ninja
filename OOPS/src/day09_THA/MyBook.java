package day09_THA;

public class MyBook extends Book {

	@Override
	void setTitle(String s) {
		this.title = s;
	}

	@Override
	String getTitle() {
		return "The title of my book is: " + this.title;
	}
	
}
