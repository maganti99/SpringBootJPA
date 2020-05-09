package com.nagesh.springJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nagesh.springJPA.Dao.EmplRepository;
import com.nagesh.springJPA.Dao.PersonRepository;
import com.nagesh.springJPA.entites.Empl;
import com.nagesh.springJPA.entites.Person;


@Service
public class SpringHiberService {
	
@Autowired
private EmplRepository emplRepository;
	
@Autowired
private PersonRepository personRepository;

public Empl createEmpl(Empl e)
 {
      Empl e1 = emplRepository.save(e);
      return e1;
 }

public Optional<Empl> readByEmpId(short id)
{
     Optional<Empl> e1 = emplRepository.findById(id);
     return e1;
}

public Iterable<Empl> readByEmpList(List<Short> ids)
{
     return emplRepository.findAllById(ids);
}

public Iterable<Empl> getByName(String name)
{
     return emplRepository.findByName(name);
}

public Iterable<Empl> getByNameSal(String name, int sal)
{
     return emplRepository.findByNameAndSal(name, sal);
}

//Methods on Person class

/*public List<Person> getByfistName(String name)
{
     return personRepository.findByName1(name);
}*/

public List<Person> getAllPersons(String name)
{
     return personRepository.getPersons(name);
}

public List<Person> getAllPerDate()
{
     return personRepository.getPerDate();
}

public List<Person> getPersons(Pageable pageable)
{
     return personRepository.getAllPersons(pageable);
}

}
