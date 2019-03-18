package camel.restservices;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public EmployeeModel firstService(@RequestParam int id) {

		EmployeeModel emp = new EmployeeModel();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId(id);
		emp.setSalary(3000);

		return emp;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public EmployeeModel secondService(@RequestBody EmployeeModel employee) {

		System.out.println("Inside POST Method");
		EmployeeModel emp = new EmployeeModel();
		emp.setName(employee.getName());
		emp.setDesignation(employee.getDesignation());
		emp.setEmpId(employee.getEmpId());
		emp.setSalary(employee.getSalary());

		return emp;
	}

}