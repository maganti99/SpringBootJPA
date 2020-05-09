package com.nagesh.springJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.nagesh.springJPA.Dao.EmplRepository;
import com.nagesh.springJPA.entites.Empl;
import com.nagesh.springJPA.entites.Person;
import com.nagesh.springJPA.service.SpringHiberService;

@SpringBootApplication
public class MyHIberApplication implements CommandLineRunner {
    
	@Autowired
	private SpringHiberService springHiberService;
	
	public static void main(String[] args) {
		SpringApplication.run(MyHIberApplication.class, args);
		
		
		System.out.println("Hello Nagesh");
		//run();
		//System.out.println(repo.findById(1));
	}
	
	@Override
	public void run(String... args) {
		
		//Empl emp = springHiberService.createEmpl(new Empl((short) 11, "Ramesh", "Fin", 9700));
		
		/*Empl e = new Empl();
		e.setId((short) 10);
		e.setName("Jack");
		e.setSal(9500);
		e.setDept("Account");*/
		//System.out.println(springHiberService.readByEmpId((short) 3).toString());
		
		/*List<Short> lst = new ArrayList<Short>();
		lst.add((short) 1);
		lst.add((short) 2);
		lst.add((short) 3);*/
		
		//springHiberService.readByEmpList(lst).forEach(System.out::println);
		
		//springHiberService.getByName("sam").forEach(System.out::println);
		
		//springHiberService.getByNameSal("sam", 7000).forEach(System.out::println);
		
		//springHiberService.getByfistName("nagesh").forEach(System.out::println);
		
		springHiberService.getAllPersons("Ram").forEach(System.out::println);
		
		//springHiberService.getPersons(PageRequest.of(0, 3, Sort.by("firstName"))).forEach(System.out::println);
		
		//springHiberService.getPersons(PageRequest.of(1,3)).forEach(System.out::println);
		
		//springHiberService.getAllPerDate().forEach(System.out::println);
		
		//repo.save(e);
		//System.out.println(repo.findById((short) 1).toString());
		
		
		/*for(Empl emp: repo.findByNameOrSal("nagesh", 7000))
		{
		  System.out.println(emp.getName());
		}*/
	}
	

}
