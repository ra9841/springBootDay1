package comm.service;

import java.util.List;

import comm.dto.EmployeeDto;

public interface EmployeeService {
    //for login operation
	EmployeeDto authenticate(String emailId, String password);
   
	//for show all/select all operation
	List<EmployeeDto> findAllEmployee();
   
	//for register/insert operation
	String saveEmployee(EmployeeDto employeeDto);

	//for delete operation
	void deleteEmployee(int employeeId);

	//for update operation
	EmployeeDto updatEmployee(int employeeId);

	String editEmployee(EmployeeDto employeeDto);

	

}
