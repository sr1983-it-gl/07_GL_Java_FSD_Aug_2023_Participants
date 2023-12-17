package utils;


public class Employee {

	private Integer id;
	private String name;
	private String job;
	private Integer managerId;
	private Double salary;
	private Integer departmentId;	
	
	private Boolean intern = false;
	
	public Employee(Integer id, String name, String job, 
		Integer managerId, Double salary, Integer departmentId) {
		
		this.id = id;
		this.name = name;
		this.job = job;
		this.managerId = managerId;
		this.salary = salary;
		this.departmentId = departmentId;		
	}

	public Employee(Integer id, String name, String job, 
		Integer managerId, Double salary, Integer departmentId, Boolean intern) {
		
		this(id, name, job, managerId, salary, departmentId);
		
		this.intern = intern;		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Boolean isIntern() {
		return intern;
	}
	public void setIntern(Boolean intern) {
		this.intern = intern;
	}
	
	/*
	 * Employee john = new Employee();
	 * boolean outcome = john.isIntern();
	 */
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append("{ ");
		result.append("[ID = " + id + "], ");		
		result.append("[Name = " + name + "], ");
		result.append("[Job = " + job + "],  ");
		result.append("[Manager-ID = " + managerId + "] ");
		result.append("[Salary = " + salary + "] ");
		result.append("[Department-ID = " + departmentId + "] ");
		result.append("[Intern = " + intern + "] ");
		result.append(" }");
		
		return result.toString();
	}
	
}
