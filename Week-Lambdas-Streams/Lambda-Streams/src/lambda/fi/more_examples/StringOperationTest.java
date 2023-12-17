package lambda.fi.more_examples;

public class StringOperationTest {

	public static void main(String[] args) {
		
//		upperCaseOperationDemo();
		
		lowerCaseOperationDemo();
	}
	
	static void upperCaseOperationDemo() {
		
		class UpperCaseOperationImpl implements StringOperation {

			@Override
			public String perform(String text) {
				return text.toUpperCase();
			}
			
		}
		
		StringOperation upperCaseOperation = 
			(String text) -> 
				{
					return text.toUpperCase();
				};
			
		
		StringOperation upperCaseOperation2 = 
				(text) -> {
					
					return text.toUpperCase();
				};
				

		StringOperation upperCaseOperation3 = 
			(text) -> 
					
					text.toUpperCase()
				;
				

		StringOperation upperCaseOperation4 = 
			(text) -> text.toUpperCase();

		StringOperation upperCaseOperation5 = 
				text -> text.toUpperCase();
			
		String outcome = upperCaseOperation5.perform("Great Learning");
		System.out.println(outcome);
	}
	
	
	static void lowerCaseOperationDemo() {
		
		StringOperation lowerCaseOperation = 
			(String text) -> 
				{
					return text.toLowerCase();
				};
					
		StringOperation lowerCaseOperation2 = 
				text -> text.toLowerCase();
			
		String outcome = lowerCaseOperation2.perform("Great Learning");
		System.out.println(outcome);
				
	}
}
