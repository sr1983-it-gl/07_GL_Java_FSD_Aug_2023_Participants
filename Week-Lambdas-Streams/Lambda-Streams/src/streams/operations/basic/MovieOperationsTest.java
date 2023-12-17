package streams.operations.basic;

import java.util.Set;

import utils.Movie;
import utils.MovieUtils;

public class MovieOperationsTest {

	public static void main(String[] args) {

		Set<Movie> allMovies = MovieUtils.loadMovies();

		MovieOperations operations = new MovieOperations(allMovies);		
//		operations.printMovies();
		
//		operations.printMovies("Christopher Nolan");
	
//		operations.printMovieNames();
		
//		operations.printFirst10MovieNames();
		
//		operations.printMoviesWithRatingMoreThan7();
		
		operations.scenario05();
	}
}
