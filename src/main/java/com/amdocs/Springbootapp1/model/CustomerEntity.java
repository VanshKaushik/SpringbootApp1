package com.amdocs.Springbootapp1.model;

import jakarta.persistence.*;

@Entity
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custname;
	public CustomerEntity(int custId, String custname) {
		super();
		this.custId = custId;
		this.custname = custname;
	}
	public CustomerEntity() {
//		super();
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	
	
	
}
