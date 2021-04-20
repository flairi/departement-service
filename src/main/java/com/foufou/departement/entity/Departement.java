package com.foufou.departement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@ToString
public class Departement {  
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long departementId;
	private String departementName;
	private String departementAdresse;
	private String departementCode;
	
	public Long getDepartementId() {
		return departementId;
	}
	public void setDepartementId(Long departementId) {
		this.departementId = departementId;
	}
	public String getDepartementName() {
		return departementName;
	}
	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}
	public String getDepartementAdresse() {
		return departementAdresse;
	}
	public void setDepartementAdresse(String departementAdresse) {
		this.departementAdresse = departementAdresse;
	}
	public String getDepartementCode() {
		return departementCode;
	}
	public void setDepartementCode(String departementCode) {
		this.departementCode = departementCode;
	}
	

}
