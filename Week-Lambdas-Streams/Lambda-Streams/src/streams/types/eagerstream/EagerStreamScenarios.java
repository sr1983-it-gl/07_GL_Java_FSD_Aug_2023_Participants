package streams.types.eagerstream;

import java.util.Set;

import utils.Movie;
import utils.MovieUtils;

public class EagerStreamScenarios {

	public static void scenario01() {

		Set<Movie> allMovies = MovieUtils.loadMovies();
	
		allMovies.stream()
			.filter(aMovie -> {
			
				System.out.println("Filtering happening on movie -> " 
					+ aMovie.getName());
				
				if (aMovie.getImdbRating() >= 8.0F) {
					System.out.println("TRUE");
					return true;
				}else {
					System.out.println("FALSE");					
					return false;
				}					
			})
			.map(aMovie -> {
				
				System.out.println("Mapping " + aMovie);
				return aMovie;
			})
			.forEach(System.out::println);
		;
	}

	
}
