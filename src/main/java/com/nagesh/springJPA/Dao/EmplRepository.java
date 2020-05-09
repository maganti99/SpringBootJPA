package com.nagesh.springJPA.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.nagesh.springJPA.entites.Empl;

import org.springframework.data.jpa.repository.Query;

public interface EmplRepository extends CrudRepository<Empl, Short>
//public interface EmplRepository extends Repository<Empl, Short> 
{
	//@Query(value="Select Emp_name from Employee where Emp_sal > :sal", nativeQuery = true)
	//@Query(value="Select name from Empl where sal > :sal")
	//List<String> getBySal(@Param("sal") int empsal);
//	List<Empl> findBySal(int salary);
//	List<Empl> findByNameOrSal(String name, int sal);
	//Empl findById(short id);
	
	
	//Optional<Empl> findById(Short empid);
	
	List<Empl> findByName(String name);
	List<Empl> findByNameAndSal(String name, int sal);

}
