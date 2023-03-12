package comm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.dao.MagicDaoRepository;
import comm.dto.EmployeeDto;
import comm.entity.EmployeeEntity;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
   
	@Autowired
	private MagicDaoRepository magicDaoRepository;
	
	//for login operation
	@Override
	public EmployeeDto authenticate(String emailId, String password) {
		Optional<EmployeeEntity> optional=magicDaoRepository.findByEmailIdAndPassword(emailId,password);//A container object which may or may not contain a non-null value.If a value is present, isPresent() returns true. If novalue is present, the object is considered empty and isPresent() returns false. 
		//inbuild method findByEmailAndPassword
		EmployeeDto employeeDto=null;
		
		if(optional.isPresent()) {
			EmployeeEntity employeeEntity=optional.get();//If a value is present, returns the value, otherwise throws NoSuchElementException.
		
		employeeDto=new EmployeeDto();
		BeanUtils.copyProperties(employeeEntity,employeeDto);
		return employeeDto;
		
		}else {	
			return employeeDto;	
		}	
	}

    //fetching all the records from data base/select all operation
	@Override
	public List<EmployeeDto> findAllEmployee() {
	
		List<EmployeeEntity> employeeEntity=magicDaoRepository.findAll();//findAll is inbuild method due to use of JpaRepository in dao layer
		List<EmployeeDto>employeeDtoList=new ArrayList<>();//blank arrayList
		
		if(employeeEntity.size()>0) {
			for(EmployeeEntity employee:employeeEntity) {//object will be come out one by one in employee
				EmployeeDto employeeDto=new EmployeeDto();//blank
				BeanUtils.copyProperties(employee, employeeDto);//here copying data from employee to employeeDto
				employeeDtoList.add(employeeDto);//all the object is added and shown,if it is not done then only last one will shown
			//employeeDtoList--collection of object
			}	
		}
		return employeeDtoList;
	}

	//for register/insert operation
	@Override
	public String saveEmployee(EmployeeDto employeeDto) {
		Optional<EmployeeEntity>existingEmployee=magicDaoRepository.findByEmployeeId(employeeDto.getEmployeeId());
		if(existingEmployee.isPresent()) {
			return"Record Id is already exist";
		}else {
			EmployeeEntity employeeEntity=new EmployeeEntity();//blank
			employeeEntity.setEmployeeId(employeeDto.getEmployeeId());
			employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
			employeeEntity.setEmailId(employeeDto.getEmailId());
			employeeEntity.setPassword(employeeDto.getPassword());
			employeeEntity.setSalary(employeeDto.getSalary());
			magicDaoRepository.save(employeeEntity);
			return "Record is inserted successfully";
		}	
	}

	//for delete operation
	@Override
	public void deleteEmployee(int employeeId) {
		magicDaoRepository.deleteById(employeeId);	
	}

	//for update operation
	@Override
	public EmployeeDto updatEmployee(int employeeId) {
		Optional<EmployeeEntity> optional=magicDaoRepository.findById(employeeId);
		EmployeeEntity employeeEntity=optional.get();
		EmployeeDto employeeDto=new EmployeeDto();//blank
		BeanUtils.copyProperties(employeeEntity, employeeDto);//copying
		return employeeDto;
	}

	@Override
	public String editEmployee(EmployeeDto employeeDto) {
		Optional<EmployeeEntity>existingEmployee=magicDaoRepository.findByEmployeeId(employeeDto.getEmployeeId());
		if(existingEmployee.isPresent()) {
			EmployeeEntity employeeEntity=new EmployeeEntity();//blank
			employeeEntity.setEmployeeId(employeeDto.getEmployeeId());
			employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
			employeeEntity.setEmailId(employeeDto.getEmailId());
			employeeEntity.setPassword(employeeDto.getPassword());
			employeeEntity.setSalary(employeeDto.getSalary());
			magicDaoRepository.save(employeeEntity);
			return "Record is updated successfully";
		}else {
			return "Record is not updated";
		}
		
	}

	
}
