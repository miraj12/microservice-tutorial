package com.mycompany.microservice.tutorial;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class MobileSuit implements Serializable {
	
	private Long id;
	private String modelName;
	private List<String> weapons;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public List<String> getWeapons() {
		return weapons;
	}
	public void setWeapons(List<String> weapons) {
		this.weapons = weapons;
	}
	
	

}
