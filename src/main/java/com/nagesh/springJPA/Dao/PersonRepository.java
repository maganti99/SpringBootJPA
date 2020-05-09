package com.nagesh.springJPA.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.nagesh.springJPA.entites.Person;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends CrudRepository<Person, Integer>

{
	
	//List<Person> findByName1(String name);
	
  //@Query(value="select P from Person P where firstName =?1")      // Positional parameter
	@Query(value="select P from Person P where firstName = :fname") // Named Parameter
	List<Person> getPersons(@Param("fname") String name);
	
	@Query(value="select * from Person_Details where Date > '2020-03-01'",nativeQuery=true)
	List<Person> getPerDate();
	
	//List<Person> findByNameAndSal(String name, int sal);
	
	@Query(value="select * from Person_Details",nativeQuery=true)
	List<Person> getAllPersons(Pageable pageable);

}
