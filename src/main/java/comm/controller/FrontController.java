package comm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.dto.EmployeeDto;
import comm.service.EmployeeService;

@Controller
public class FrontController {
	
    @Autowired
    EmployeeService employeeService;
	
	
	@GetMapping("/hi")
	public String page() {
		
		return "hi";
	}
	
    //for login operation
	@GetMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("lgn")
	public String authenticateEmployee(@RequestParam String emailId,@RequestParam String password,Model model){
		EmployeeDto employeeDto=employeeService.authenticate(emailId,password);
		
		if(employeeDto!=null) {
			model.addAttribute("employee", employeeDto);
		     return "show";
		}else {
			model.addAttribute("msg","Wrong...try Again");
			return "login";
		}
	
	}
//fetch all records from db/select all operation
	@GetMapping("/showEmployee2")
	public String ShowAllEmployee(Model model) {
		List<EmployeeDto>employeeDtoList=employeeService.findAllEmployee();
		model.addAttribute("allEmployee",employeeDtoList);
		return "showEmployee2";
	}
	
	//for registration/insert operation
	@GetMapping("/registration")
	public String saveEmployee() {
		return "employeeRegistration";
	}
	
	@PostMapping("/register")
	public String saveRecord(@ModelAttribute EmployeeDto employeeDto,Model model) {
		String message=employeeService.saveEmployee(employeeDto);
		model.addAttribute("message", message);
		return"employeeRegistration";
	}
	
	//for delete operation
	@GetMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam int employeeId) {
		employeeService.deleteEmployee(employeeId);
		
		return"redirect:/showEmployee2";
	}
	
	//for edit/update operation
	@GetMapping("/updateEmployee")
	public String updateEmployee(@RequestParam int employeeId,Model model) {
		EmployeeDto employeeDto=employeeService.updatEmployee(employeeId);
		model.addAttribute("empDto", employeeDto);
		return"update";
	}
	
	@PostMapping("/edit")
	public String editEmployee(@ModelAttribute EmployeeDto employeeDto,Model model) {
		String message=employeeService.editEmployee(employeeDto);
		model.addAttribute("mess",message);
		return "redirect:/showEmployee2";
	}
	
}
