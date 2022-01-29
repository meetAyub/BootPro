package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATA")
public class entity {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column(name = "NAME")
	private String NAME;
	@Column(name = "AGE")
	private String AGE;

	public String toString() {
		return "ID =" + ID + "    NAME = " + NAME + "    AGE = " + AGE;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getAGE() {
		return AGE;
	}

	public void setAGE(String aGE) {
		AGE = aGE;
	}

}