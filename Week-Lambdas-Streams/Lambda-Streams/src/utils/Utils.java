package utils;


import java.util.Set;

public class Utils {

	public static void print(Set<? extends Object> movies) {
		
		for (Object object : movies) {
			
			System.out.println(object);
		}
	}
	
}
