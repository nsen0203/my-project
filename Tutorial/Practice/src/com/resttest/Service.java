package com.resttest;

import com.revision.comp.Employee;

@Service
public class Service {
	
	@Autowired
	private Repo repo;
	
	public Employee getEmployeeById(int id) {
		return this.repo.findById(id);
	}
	
	public Employee addEmployee(Employee e) {
		this.repo.save(e);
		
	}
	
	public void deleteEmployeeById(int id) {
		return this.repo.deleteById(id);
	}
	
	public Employee updateEmployee(Employee employee, int id) {
		employee.setId(id);
		return this.repo.save(employee);
	}

}
