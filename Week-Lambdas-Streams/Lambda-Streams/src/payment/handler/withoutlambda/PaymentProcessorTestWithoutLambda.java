package payment.handler.withoutlambda;

public class PaymentProcessorTestWithoutLambda {

	public static void main(String[] args) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		Manager ujjwal = new Manager();
		paymentProcessor.processPayment(ujjwal, 125000D);

		Employee harish = new Employee();
		paymentProcessor.processPayment(harish, 95000D);

		SalesPerson jim = new SalesPerson();
		paymentProcessor.processPayment(jim, 115000D);		
	}
}
