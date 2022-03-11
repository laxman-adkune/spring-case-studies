package com.student.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Studdata" database table.
 * 
 */
@Entity
@Table(name="\"Studdata\"")
@NamedQuery(name="Studdata.findAll", query="SELECT s FROM Studdata s")
public class Studdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SID")
	private Long sid;
	
	@Column(name="SNAME")
	private String sname;

	@Column(name="TECH")
	private String tech;

	public Studdata() {
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getTech() {
		return this.tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}