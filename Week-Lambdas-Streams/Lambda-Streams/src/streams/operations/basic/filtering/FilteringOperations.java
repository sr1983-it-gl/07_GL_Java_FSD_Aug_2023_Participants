package streams.operations.basic.filtering;

import java.util.Set;

import utils.Employee;
import utils.EmployeeUtils;

public class FilteringOperations {

	public static void scenario01() {
		
		Set<Employee> employees = EmployeeUtils.loadEmployees();
		
		employees
			.stream()
			.filter(Employee :: isIntern)
			.forEach(System.out::println);	
	}
	
	// List all the managers who are earning less than 1L
	public static void scenario02() {
		
		Set<Employee> employees = EmployeeUtils.loadEmployees();
		
		employees
			.stream() // 15
			.filter(employee -> (employee.getJob().equals("Manager"))) // 7
			.filter(employee -> (employee.getSalary() < 100000.0)) // 3
			.forEach(System.out::println);
//			.collect()
		
	}
}
