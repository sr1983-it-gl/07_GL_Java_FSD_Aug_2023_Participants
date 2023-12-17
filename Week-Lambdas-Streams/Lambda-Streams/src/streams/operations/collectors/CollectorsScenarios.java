package streams.operations.collectors;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import utils.Employee;
import utils.EmployeeUtils;
import utils.Utils;

import utils.Person;

public class CollectorsScenarios {

	public static void scenario01() {
		
		Set<Employee> allEmployees 
			= EmployeeUtils.loadEmployees();
		
		Set<Employee> salesPersonSet = allEmployees
			.stream()// 15 employee
			.filter(employee -> (employee.getJob().equals("Sales Person"))) // 5 employee objects
			.collect(Collectors.toSet());
		
		Utils.print(salesPersonSet);
	}


	public static void scenario02() {
		
		Set<Employee> allEmployees 
			= EmployeeUtils.loadEmployees();
		
		Map<Integer, Employee> map = 
		allEmployees
			
			.stream()
			.filter(employee -> (employee.getJob().equals("Sales Person"))) // 3 employee objects			
			.collect(Collectors.toMap(
				Employee::getId, employee -> (employee)));
		
		
		Set<Map.Entry<Integer, Employee>> entrySet = map.entrySet();		
		for (Map.Entry<Integer, Employee> entry : entrySet) {

			Integer employeeNo = entry.getKey();
			Employee employee = entry.getValue();			
			
			System.out.println("Key -> " + employeeNo + ", Value -> " + employee);
		}		
	}

	
	public static void scenario03() {
		
		Set<Employee> allEmployees 
			= EmployeeUtils.loadEmployees();
		
		Map<Integer, Person> allPersons = 
		allEmployees
			
			.stream()
			.filter(employee -> (employee.getJob().equals("Manager"))) // 3 employee objects			
			.collect(Collectors.toMap(
				Employee::getId, employee -> {
					
					Person personObj = new Person();
					personObj.setName(employee.getName());
					return personObj;
				}
			));
		
		
		Set<Map.Entry<Integer, Person>> entrySet = allPersons.entrySet();		
		for (Map.Entry<Integer, Person> entry : entrySet) {

			Integer employeeNo = entry.getKey();
			Person personObj = entry.getValue();			
			
			System.out.println("Key -> " 
					+ employeeNo + ", Value -> " + personObj);
		}		
	}	
}
