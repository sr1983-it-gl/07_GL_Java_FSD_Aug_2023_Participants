package payment.handler.withlambda;

import lambda.fi.more_examples.ComparisonOperation;
import payment.handler.withoutlambda.PaymentProcessor;

public class PaymentProcessorTestWithLambda {

	public static void main(String[] args) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		ComparisonOperation maxOperation4 = 
				(a, b) ->  (a > b) ? a : b;
		
				
//		Payable ujjwal =
//				(salary) -> (salary + (salary * 10 / 100));
				
		Double ujjwalSalary = 125000D;
		paymentProcessor.processPayment(
			(salary) -> (salary + (salary * 10 / 100)), ujjwalSalary );

		Double harishSalary = 95000D;
		paymentProcessor.processPayment(
			(salary) -> (salary + (salary * 5 / 100)), harishSalary);

		Double jimSalary = 115000D;
		paymentProcessor.processPayment(
			(salary) -> (salary + (salary * 17 / 100)), jimSalary);		
	}
}
