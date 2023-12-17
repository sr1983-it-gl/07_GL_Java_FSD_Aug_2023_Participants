package utils;


public class Manager extends Employee {
	
	public Manager(Integer id, String name, String job, 
			Integer managerId, Double salary, Integer departmentId) {
	
		super(id, name, job, managerId, salary, departmentId);
	}
	
	public void performSalaryIncrement() {
		
		Double existingSalary = getSalary();
		
		Double newSalary = existingSalary + 
				(existingSalary * 10) / 100;
		
		setSalary(newSalary);		
	}
	
	public String toString() {
		
		return super.toString();
	}
}
