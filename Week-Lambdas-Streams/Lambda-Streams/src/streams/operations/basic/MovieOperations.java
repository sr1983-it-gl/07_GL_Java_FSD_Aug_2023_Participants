package streams.operations.basic;

import java.util.Set;

import utils.Movie;

public class MovieOperations {

	private Set<Movie> allMovies;
	
	public MovieOperations(Set<Movie> allMovies) {
		
		this.allMovies = allMovies;
	}
	
	public void printMovies() {
		
		allMovies.stream()
			.forEach(System.out::println);
	}
	
	public void printMovies(String director) {

		allMovies.stream()
			.filter(aMovie -> (aMovie.getDirector().equals(director)))
			.forEach(System.out::println);		
	}

	public void printMovieNames() {

		allMovies.stream()
			.map(Movie::getName)
			.forEach(System.out::println);		
	}

	public void printFirst10MovieNames() {

		allMovies.stream()
			.map(Movie::getName)
			.limit(10)
			.forEach(System.out::println);		
	}

	public void printMoviesWithRatingMoreThan7() {

		allMovies.stream()
			.filter(aMovie -> (aMovie.getImdbRating() >= 7.0F))
			.forEach(System.out::println);		
	}
	
	
	public void scenario05() {

		allMovies.stream()
			
			.filter(aMovie -> {
			
				System.out.println("Filter method called..");
				return 
				(aMovie.getImdbRating() >= 7.0F);
			})
				// intermediate operation
			.map(Movie::getName)
				// intermediate operation
			.forEach(System.out::println);	
				// terminal operation	
	}
	
//	m1() {
	// stream
		// o1
		// o2
		// o3
		// to();
//	}
}
