package payment.handler.withoutlambda;

public class PaymentProcessor {

	
	public void processPayment(Payable payable, Double salary) {
		
		double increasedPay = payable.incrementSalary(salary);
		System.out.println("Original salary is " + salary);
		System.out.println("Salary increment is done. Revised pay is " + increasedPay);
	}
	
}
