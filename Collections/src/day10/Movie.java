package day10;

public class Movie {
	private int id, rating;
	private String name;
	public Movie() {
		
	}
	public Movie(int id, int rating, String name) {
		
		this.id = id;
		this.rating = rating;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", rating=" + rating + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
