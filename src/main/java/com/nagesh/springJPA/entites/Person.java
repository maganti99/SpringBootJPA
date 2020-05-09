package com.nagesh.springJPA.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity()
@Table(name="Person_Details")
@DynamicUpdate
/*@NamedNativeQueries(value= {
	@NamedNativeQuery(name="Person.getPersons",query="select * from Person_Details",resultClass=Person.class),
	@NamedNativeQuery(name="Person.getPerDate",query="select * from Person_Details where Date > '2020-02-01'",resultClass=Person.class)
})*/
/*@NamedQueries(value= {
		@NamedQuery(name="Person.findByName1",query="select P from Person P where firstName =?1")
	})
*/public class Person {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Date")
	private Date creationDate;
	
	
	public Person(int id, String firstName, String lastName, String email, Date creationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}
	
	
	public Person() {		
	}


	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreationDate() {
		return creationDate;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}
