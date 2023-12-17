package payment.handler.withoutlambda;

@FunctionalInterface
public interface Payable {

	Double incrementSalary(Double salary);
}
