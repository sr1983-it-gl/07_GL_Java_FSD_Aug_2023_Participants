package streams.primitivestreams;

import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

import utils.Movie;
import utils.MovieUtils;

public class PrimitiveStreamOperations {

	public static void scenario01() {
	
		DoubleStream movieRatings = DoubleStream.of(5.4, 6.6, 7.7);
		
		movieRatings
			.forEach(System.out::println);		
	}
	
	public static void scenario02() {
		
		// 25
		Set<Movie> allMovies = MovieUtils.loadMovies();
		
		Optional<Float> allRatingsSum 
		= allMovies
			.stream() // 25 [Movies]
			.map(Movie::getImdbRating) // 25 [6.6, 7.7, ...... 8.1] 
			.reduce(Float::sum);
		// sum [10, 20, 30] -> 60
		// avg [10, 20, 30] -> 20
		// min [10, 30, 5] -> 5
		// max [100, -20, -150] -> 100
		
		System.out.println(allRatingsSum);
		
//		allMovies
//			.stream() // 25 [Movie Objects]
//			.map(Movie::getName) // [25 Movie-Name]
//			.forEach(System.out::println);
		
		
	}

	public static void scenario03() {
		
		Set<Movie> allMovies = MovieUtils.loadMovies();
		
		// 25 Movies [m1, m2, ... m25] -> stream
		// 25 [6.6, 7.7, 6.4, ..... 8.3] -> stream
		DoubleStream movieRatingsStream = allMovies
			.stream() // 25 Movies
			.mapToDouble(Movie::getImdbRating);
		
		movieRatingsStream
			.filter (rating -> rating > 8.0)
			.forEach(System.out::println);
	}

	
	public static void scenario04() {
		
		Set<Movie> allMovies = MovieUtils.loadMovies();
		
		Double movieRatingsSum = allMovies
			.stream() //25 movie objects
			.mapToDouble(Movie::getImdbRating) // 25 [6.6, 8.2, ... 6.9] 
			.sum();
		
		System.out.println(movieRatingsSum);
	}	
}
