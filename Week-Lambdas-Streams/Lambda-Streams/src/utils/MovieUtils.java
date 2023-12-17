package utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieUtils {

	public static Set<Movie> allMovies;
	
	public static Set<Movie> loadMovies(){
		
		allMovies = new HashSet<Movie>();
		
		// Action - Rating [6-8], YearOfRelease [2010-2015]
		allMovies.add(new Movie("Edge of Darkness", 2010, 6.6F));
		allMovies.add(new Movie("No Mercy", 2010, 7.4F));
		allMovies.add(new Movie("The Hunger Games", 2012, 7.2F));
		allMovies.add(new Movie("Godzilla", 2014, 6.4F));
		allMovies.add(new Movie("Man of Steel", 2013, 7.1F));
		allMovies.add(new Movie("Snowpiercer", 2013, 7.1F));
		allMovies.add(new Movie("Jack Reacher", 2012, 7.0F));
		allMovies.add(new Movie("Guardians of the Galaxy", 2014, 8.0F));
		allMovies.add(new Movie("The Avengers", 2012, 8.0F));
		allMovies.add(new Movie("Predestination", 2014, 7.4F));
		allMovies.add(new Movie("Kingsman - The Secret Service", 2014, 7.7F));
		allMovies.add(new Movie("X-Men - First Class", 2011, 7.7F));
		allMovies.add(new Movie("Robin Hood", 2010, 6.6F));
		allMovies.add(new Movie("Skyfall", 2012, 7.8F));
		allMovies.add(new Movie("Mission Impossible - Ghost Protocol", 2011, 7.4F));
		
		
		// Comedy - Rating [5-7], YearOfRelease [2005-2009]
		allMovies.add(new Movie("The Hoilday", 2006, 6.9F));
		allMovies.add(new Movie("Charlie and the Chocolate Factory", 2005, 6.7F));
		allMovies.add(new Movie("The Devil wears Prada", 2006, 6.9F));
		allMovies.add(new Movie("Mr and Mrs. Smith", 2005, 6.5F));
		allMovies.add(new Movie("Step Brothers", 2008, 6.9F));
		allMovies.add(new Movie("Mamaa Mia !", 2008, 6.5F));
		allMovies.add(new Movie("Night at the Museum", 2006, 6.5F));
		allMovies.add(new Movie("Burn after Reading", 2008, 7.0F));
		allMovies.add(new Movie("Get Smart", 2008, 6.5F));
		allMovies.add(new Movie("27 Dresses", 2008, 6.1F));
		
		// Christopher Nolan Movies
		allMovies.add(new Movie("Oppenheimer", 2023, 8.4F, "Christopher Nolan"));
		allMovies.add(new Movie("Tenet", 2020, 7.3F, "Christopher Nolan"));
		allMovies.add(new Movie("Dunkirk", 2017, 7.8F, "Christopher Nolan"));
		allMovies.add(new Movie("Interstellar", 2014, 8.7F, "Christopher Nolan"));
		allMovies.add(new Movie("The Dark Night Rises", 2012, 8.4F, "Christopher Nolan"));
		allMovies.add(new Movie("Inception", 2010, 8.8F, "Christopher Nolan"));
		allMovies.add(new Movie("The Prestige", 2006, 8.5F, "Christopher Nolan"));
		allMovies.add(new Movie("Batman Begins", 2005, 8.2F, "Christopher Nolan"));
		allMovies.add(new Movie("Insomnia", 2002, 7.2F, "Christopher Nolan"));
		allMovies.add(new Movie("Memento", 2000, 8.4F, "Christopher Nolan"));
		
		return allMovies;
	}
	
	// ReleasedBetween2013And2015, WithRatingBetween7And8
	public static Set<Movie> getMoviesScenario01WithoutLambda(
			Set<Movie> allMovies){
		
		Set<Movie> resultMovies = new HashSet<Movie>();
		
		Iterator<Movie> movieIterator = allMovies.iterator();
		
		while (movieIterator.hasNext()) {
			
			Movie aMovie = movieIterator.next();
		
			int yearOfRelease = aMovie.getYearOfRelease();				
			float imdbRating = aMovie.getImdbRating();
						
			if ( (yearOfRelease >= 2013 && yearOfRelease <=2015 ) &&
				(imdbRating >= 7.0 && imdbRating <= 8.0)) {
				
				resultMovies.add(aMovie);
			}
		}
		
		return resultMovies;
	}

	
	public static Set<Movie> getMoviesScenario01WithLambda(
		Set<Movie> allMovies){
		
		return allMovies.stream()
			.filter(aMovie -> (
					aMovie.getImdbRating() >= 7.0F 
					&& aMovie.getImdbRating() <= 8.0F )
				)
			.filter(
				aMovie -> (
					aMovie.getYearOfRelease() >= 2013 
					&& aMovie.getYearOfRelease() <= 2015)
			)
			.collect(Collectors.toSet());
	}
	
	
}
