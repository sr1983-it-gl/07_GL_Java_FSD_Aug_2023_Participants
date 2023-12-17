package payment.handler.withoutlambda;

public class Employee implements Payable{
	
	@Override
	public Double incrementSalary(Double salary) {
		
		return salary + (salary * 5 / 100);
	}

}
