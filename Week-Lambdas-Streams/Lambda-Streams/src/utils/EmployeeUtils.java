package utils;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class EmployeeUtils {

	private static Set<Employee> employees;
	
	public static Set<Employee> loadEmployees(){
		
		
		employees = new HashSet<Employee>();
		
		employees.add(new Employee(Integer.valueOf(101), "Bob", "Clerk", 
			Integer.valueOf(300), 80000.0, Integer.valueOf(10), Boolean.TRUE));
		
		employees.add(new Employee(Integer.valueOf(102), "Ross", "Clerk", 
			Integer.valueOf(105), 80000.0, Integer.valueOf(10), Boolean.TRUE));
		employees.add(new Employee(Integer.valueOf(103), "Alan", "Associate", 
			Integer.valueOf(107), 120000.0, Integer.valueOf(20)));
		employees.add(new Employee(Integer.valueOf(104), "John", "Manager", 
			Integer.valueOf(222), 160000.0, Integer.valueOf(10)));
		employees.add(new Employee(Integer.valueOf(105), "Smith", "Manager", 
			Integer.valueOf(222), 150000.0, Integer.valueOf(20)));

		employees.add(new Employee(Integer.valueOf(106), "Jeny", "Manager", 
			Integer.valueOf(222), 160000.0, Integer.valueOf(30)));
		employees.add(new Employee(Integer.valueOf(107), "Serena", "Analyst", 
			Integer.valueOf(105), 95000.0, Integer.valueOf(20)));
		employees.add(new Employee(Integer.valueOf(108), "Will", "Sales Person", 
			Integer.valueOf(105), 70000.0, Integer.valueOf(10), Boolean.TRUE));
		employees.add(new Employee(Integer.valueOf(109), "Ryan", "Clerk", 
			Integer.valueOf(104), 80000.0, Integer.valueOf(10)));
		employees.add(new Employee(Integer.valueOf(110), "Henry", "Clerk", 
			Integer.valueOf(105), 80000.0, Integer.valueOf(20)));

		employees.add(new Employee(Integer.valueOf(111), "Rose", "Sales Person", 
			Integer.valueOf(106), 80000.0, Integer.valueOf(30)));
		employees.add(new Employee(Integer.valueOf(112), "Harry", "Sales Person", 
			Integer.valueOf(105), 95000.0, Integer.valueOf(20)));
		employees.add(new Employee(Integer.valueOf(113), "Prim", "Analyst", 
			Integer.valueOf(106), 95000.0, Integer.valueOf(30), Boolean.TRUE));
		employees.add(new Employee(Integer.valueOf(114), "Nancy", "Manager", 
			Integer.valueOf(300), 95000.0, Integer.valueOf(40)));
		employees.add(new Employee(Integer.valueOf(115), "Dev", "Manager", 
			Integer.valueOf(300), 98000.0, Integer.valueOf(40)));
		
		return employees;
		
	}
	
	
	static void employeesAsMap() {
		
		Map<Integer, Employee> employeesMap = new HashMap();
		
		Employee e1 = new Employee(Integer.valueOf(101), "Bob", "Clerk", 
				Integer.valueOf(300), 80000.0, 
				Integer.valueOf(10), Boolean.TRUE);
		
		employeesMap.put(Integer.valueOf(101), e1);
		
		Employee e2 = new Employee(Integer.valueOf(102), "Ross", "Clerk", 
				Integer.valueOf(105), 80000.0, Integer.valueOf(10), Boolean.TRUE);
		
		employeesMap.put(Integer.valueOf(102), e2);
		
	}
}
