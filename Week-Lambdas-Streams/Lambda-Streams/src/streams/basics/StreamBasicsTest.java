package streams.basics;

import java.util.Set;

import utils.Movie;
import utils.MovieUtils;
import utils.Utils;

public class StreamBasicsTest {

	public static void main(String[] args) {
		
		Set<Movie> allMovies = MovieUtils.loadMovies();
		
		Set<Movie> movies 
			= MovieUtils.getMoviesScenario01WithoutLambda(allMovies);
		Utils.print(movies);
		
		System.out.println("-------------------------");
		
		movies 
			= MovieUtils.getMoviesScenario01WithLambda(allMovies);
		Utils.print(movies);
		
	}
	
	
}
