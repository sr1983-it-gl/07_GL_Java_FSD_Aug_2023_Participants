package utils;


import java.util.Set;

public class Movie {

	private String name;
	private int yearOfRelease;	
	private Set<String> genres;
	private float imdbRating;
	private String director;
	
	public Movie(String name, int yearOfRelease, float imdbRating) {
		
		this.name = name;
		this.yearOfRelease = yearOfRelease;
		this.imdbRating = imdbRating;
		this.director = "";
	}

	public Movie(String name, int yearOfRelease, float imdbRating, String director) {
		
		this(name, yearOfRelease, imdbRating);
		
		this.director = director;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public Set<String> getGenres() {
		return genres;
	}
	public void setGenres(Set<String> genres) {
		this.genres = genres;
	}
	public float getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(float imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append("{ ");
		result.append("[Name = " + name + "], ");		
		result.append("[YearOfRelease = " + yearOfRelease + "], ");
		result.append("[Rating = " + imdbRating + "],  ");
		result.append("[Director = " + director + "] ");
		result.append(" }");
		
		return result.toString();
	}
}
