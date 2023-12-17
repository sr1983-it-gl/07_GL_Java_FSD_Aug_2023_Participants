package lambda.fi.more_examples;


public class ComparisonOperationTest {

	public static void main(String[] args) {
			
		maxOperation();
		minOperation();
	}
	
	static void maxOperation() {
		
		
		maxOperationLambdaImplementations();
		
		testMaxOperation();
		
	}
	
	static void maxOperationLambdaImplementations() {
		
		class ComparisonOperationImpl implements ComparisonOperation {

			@Override
			public Integer compare(Integer a, Integer b) {
				
				if (a > b) {
					return a;
				}else {
					return b;
				}					
			}			
		}
		
		ComparisonOperationImpl obj1 = new ComparisonOperationImpl();
		
		
		String s = "";
		ComparisonOperation maxOperation = 
			(Integer a, Integer b) -> {
				
				if (a > b) {
					return a;
				}else {
					return b;
				}				
		};

	
		ComparisonOperation maxOperation2 = 
			(a, b) -> {
				
				if (a > b) {
					return a;
				}else {
					return b;
				}				
			};

		ComparisonOperation maxOperation3 = 
			(a, b) -> {
				
				return (a > b) ? a : b;
			};

		ComparisonOperation maxOperation4 = 
			(a, b) ->  (a > b) ? a : b;

		ComparisonOperation maxOperation5 = 
			(a, b) ->  (a > b) ? a : b;
						
	}
	
	
	static void testMaxOperation() {
		
		ComparisonOperation maxOperation = 
				(a, b) ->  (a > b) ? a : b;
		
		int a = 10;
		int b = 20;
		
		Integer outcome = maxOperation.compare(a, b);
		System.out.printf("Max of %d and %d is %d \n", a, b, outcome);
	}

	static void minOperation() {
		
		ComparisonOperation minOperation = 
				(a, b) ->  (a < b) ? a : b;
		
		int a = -25;
		int b = -55;
		
		Integer outcome = minOperation.compare(a, b);
		System.out.printf("Min of %d and %d is %d \n", a, b, outcome);
	}

}
