package com.resttest;


@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return this.service.getEmployeeById(id);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this .service.addEmployee(employee);
	}

	@DeleteMapping("/employee/id")
	public void deleteEmployeeById(@PathVariable("id") int id) {
		this.service.deleteEmployeeById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
		return this.service.updateEmployee(employee, id);
	}
}