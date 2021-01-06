package com.elrahhal.importservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "personel_no")
	private String personelNo;
	
	public User(int id, String firstName, String lastName, String personelNo) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.personelNo = personelNo;
	}
	public User() {
	}

	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonelNo() {
		return personelNo;
	}
	public void setPersonelNo(String personelNo) {
		this.personelNo = personelNo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}