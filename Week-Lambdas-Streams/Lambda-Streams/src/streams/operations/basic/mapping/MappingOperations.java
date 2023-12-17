package streams.operations.basic.mapping;

import java.util.Set;
import java.util.stream.Stream;

import utils.Employee;
import utils.EmployeeUtils;
import utils.Manager;

public class MappingOperations {

	public static void scenario01() {
		
		Set<Employee> employees = EmployeeUtils.loadEmployees();
	
		Stream<String> employeeNamesStream = employees
			.stream()
			.map(Employee :: getName);
			
		employeeNamesStream
			.forEach(System.out::println);
	}


	public static void scenario02() {
		
		Set<Employee> employees = EmployeeUtils.loadEmployees();
	
		Stream<String> employeeNamesStream = employees
			.stream()
			.map(Employee :: getName)
			.map(String::toUpperCase);		
			
		employeeNamesStream
			.forEach(System.out::println);
	}
	
	// Take out all managers and add 10% increment
	public static void scenario03() {
		
		Set<Employee> employees = EmployeeUtils.loadEmployees();
		
		employees
			.stream()
			.filter(employee -> (employee.getJob().equals("Manager")))
			.forEach(System.out::println);

		
		System.out.println("Performing 10% increment on manager objects");
		System.out.println("----------------------------------------------------");
		Stream<Manager> managerStream = employees
			.stream()
			.filter(employee -> (employee.getJob().equals("Manager")))
			.map(employee -> {
				
				Manager managerObj 
					= new Manager(employee.getId(), employee.getName(),
					employee.getJob(), employee.getManagerId(), 
					employee.getSalary(), employee.getDepartmentId());
				
				managerObj.performSalaryIncrement();
				
				return managerObj;
			});
		
		managerStream
			.forEach(System.out::println);
	}

}
