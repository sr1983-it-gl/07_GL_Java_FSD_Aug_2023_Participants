package streams.types.lazystream;

import java.util.Set;

import utils.Movie;
import utils.MovieUtils;

public class LazyStreamScenarios {

	public static void scenario01() {

		Set<Movie> allMovies = MovieUtils.loadMovies();
	
		allMovies.stream()
			.filter(aMovie -> {
			
				System.out.println("Filtering happening on movie -> " 
					+ aMovie.getName());
				
				if (aMovie.getImdbRating() >= 8.0F) {
					return true;
				}else {
					return false;
				}				
		});
	}

	public static void scenario02() {

		Set<Movie> allMovies = MovieUtils.loadMovies();
	
		allMovies.stream()
			.filter(aMovie -> {
			
				System.out.println("Filtering happening on movie -> " 
					+ aMovie.getName());
				
				if (aMovie.getImdbRating() >= 8.0F) {
					return true;
				}else {
					return false;
				}				
		})
		.count();
	}	
}
