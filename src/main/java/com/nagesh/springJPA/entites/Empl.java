package com.nagesh.springJPA.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="Employee")
public class Empl {
	
	@Id
	@Column(name="Emp_id")
	private short id;
	@Column(name="Emp_name")
	private String name;
	@Column(name="Emp_dept")
	private String dept;
	@Column(name="Emp_sal")
	private int sal;
	
	public Empl() {
		
	}
	
	public Empl(short id, String name, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	
	
	

}
