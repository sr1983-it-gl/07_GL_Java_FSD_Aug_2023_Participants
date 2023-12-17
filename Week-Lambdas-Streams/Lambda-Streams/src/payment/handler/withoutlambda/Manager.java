package payment.handler.withoutlambda;

public class Manager implements Payable{
	
	@Override
	public Double incrementSalary(Double salary) {
		
		return salary + (salary * 10 / 100);
	}

}
