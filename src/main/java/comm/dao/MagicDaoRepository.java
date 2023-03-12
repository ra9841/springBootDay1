package comm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comm.dto.EmployeeDto;
import comm.entity.EmployeeEntity;

//public interface MagicDaoRepository extends JpaRepository<EmployeeEntity,Integer> {//class,primary key type (integer) //all the operatio done by Jparepository
public interface MagicDaoRepository extends CrudRepository<EmployeeEntity,Integer> {//only crud operation is done by Crudrepository
	//for login operation
	Optional<EmployeeEntity> findByEmailIdAndPassword(String emailId, String password);
   
	//for show all/select all operation
	List<EmployeeEntity> findAll();
    
	//for insert/register operation
	Optional<EmployeeEntity> findByEmployeeId(int employeeId);

	//for update operation
	Optional<EmployeeEntity> findById(int employeeId);

	
	

	
	
	

	
	
	
}
