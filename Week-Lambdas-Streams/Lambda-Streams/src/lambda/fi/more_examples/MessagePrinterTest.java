package lambda.fi.more_examples;

public class MessagePrinterTest {

	public static void main(String[] args) {
			
		messagePrinterImplemntations();
	}
	
	static void messagePrinterImplemntations() {
		
		MessagePrinter welcomePrinter = 
			() -> {
				System.out.println("Welcome every to this training session");
			};

		MessagePrinter weekendMessagePrinter = 
			() -> System.out.println("Today is a weekend, let's enjoy");
			
		MessagePrinter employyeeWelcomeMessagePrinter =
			() -> {
				System.out.println("Hello employee, welcome to our team");
				System.out.println("Have a great time with our organization");
			};
		
//		MessagePrinter employyeeWelcomeMessagePrinter =
//			() -> 
//				System.out.println("Hello employee, welcome to our team");
//				System.out.println("Have a great time with our organization");
//			;
			
		welcomePrinter.print();
		weekendMessagePrinter.print();
	}
}
