package payment.handler.withoutlambda;

public class SalesPerson implements Payable{
	
	@Override
	public Double incrementSalary(Double salary) {
		
		return salary + (salary * 17 / 100);
	}

}
