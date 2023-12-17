package streams.creation;

import java.util.stream.Stream;

import utils.Movie;

public class StreamCreationOperations {

	public static void createEmptyStream() {
		
		 Stream<Movie> emptyStream = Stream.empty();
		 System.out.println("Movies: " + emptyStream);		 
	}
	
	public static void createValuesStream() {
		
		 Stream<String> movieStream = Stream.of(
			"Rebecaa",
			"Dial M for Murder");
		 
		 movieStream.forEach(System.out::println);
	}
}
